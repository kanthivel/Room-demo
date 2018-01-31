package com.example.kanthivel.roomdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.database.Cursor;

import com.example.kanthivel.roomdemo.database.CouponsDatabase;
import com.example.kanthivel.roomdemo.database.entity.CartItem;
import com.example.kanthivel.roomdemo.database.entity.Product;
import com.example.kanthivel.roomdemo.model.CartItemPojo;
import com.example.kanthivel.roomdemo.model.ShoppingListItem;

import java.util.List;

public class CartViewModel extends ViewModel {

    private CouponsDatabase couponsDatabase;

    public CartViewModel(CouponsDatabase database) {
        super();
        couponsDatabase = database;
    }

    public LiveData<List<CartItemPojo>> getCartItemList() {
        LiveData<List<CartItemPojo>> cartItemList = couponsDatabase.CartItemDao().getCartItems(234, 14);
        return cartItemList;
    }

    public List<ShoppingListItem> getShoppingListItems() {
        return couponsDatabase.ShoppingListDao().getShoppingListItems("00465", "014", "8");
    }

    public Cursor getShoppingListItemsCursor() {
        return couponsDatabase.ShoppingListDao().getShoppingListItemsCursor("00465", "014", "8");
    }

    public void insertData(CartItem cartItem, Product product) {
        couponsDatabase.ProductDao().insert(product);
        couponsDatabase.CartItemDao().insert(cartItem);
    }
}
