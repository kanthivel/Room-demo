package com.example.kanthivel.roomdemo;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.kanthivel.roomdemo.database.entity.CartItem;
import com.example.kanthivel.roomdemo.database.entity.Product;
import com.example.kanthivel.roomdemo.model.CartItemPojo;
import com.example.kanthivel.roomdemo.model.Location;
import com.example.kanthivel.roomdemo.model.ShoppingListItem;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CartAdapter cartAdapter;
    private CartViewModel cartViewModel;
    private Button insertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        insertButton = findViewById(R.id.insert_button);
        setOnClickListener();
        setupRecyclerView();
        setViewModel();
        logShoppingLIstitems();
    }

    private void setupRecyclerView() {
        cartAdapter = new CartAdapter();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(cartAdapter);
    }

    private void setViewModel() {
        cartViewModel = ViewModelProviders.of(this, new CartViewModelFactory(getApplication())).get(CartViewModel.class);
        cartViewModel.getCartItemList().observe(this, new Observer<List<CartItemPojo>>() {
            @Override
            public void onChanged(@Nullable List<CartItemPojo> cartItemPojos) {
                displayProducts(cartItemPojos);
            }
        });
    }

    private void setOnClickListener() {
        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long millis = System.currentTimeMillis();
                Product product = new Product(((int) millis), "prod6", 34, 12, false,
                        "weight", "dairy", new Location("ailse1", 234, 14));
                CartItem cartItem = new CartItem((int) millis, 1, "eqtr", false, new Date());
                cartViewModel.insertData(cartItem, product);
            }
        });
    }

    private void logShoppingLIstitems() {
        List<ShoppingListItem> shoppingListItems = cartViewModel.getShoppingListItems();
        Log.i("ShoppingList", "<--------------------------------------------------------------------------------->");
        Log.i("ShoppingList", shoppingListItems.get(0).toString());
        Log.i("ShoppingList", "<--------------------------------------------------------------------------------->");
        Log.i("ShoppingListCursor", "<--------------------------------------------------------------------------------->");
        Log.i("ShoppingListCursor", DatabaseUtils.dumpCursorToString(cartViewModel.getShoppingListItemsCursor()));
        Log.i("ShoppingListCursor", "<--------------------------------------------------------------------------------->");
    }

    private void displayProducts(List<CartItemPojo> cartItems) {
        cartAdapter.setData(cartItems);
    }
}
