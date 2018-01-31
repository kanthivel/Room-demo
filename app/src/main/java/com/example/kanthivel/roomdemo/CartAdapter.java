package com.example.kanthivel.roomdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kanthivel.roomdemo.model.CartItemPojo;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ProductViewHolder> {

    private List<CartItemPojo> cartItems = new ArrayList<>();

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product, parent, false);

        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.bind(cartItems.get(position));
    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    public void setData(List<CartItemPojo> cartItems) {
        this.cartItems = cartItems;
        notifyDataSetChanged();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private TextView title, category, quantity, date, ailse;

        public ProductViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            category = itemView.findViewById(R.id.category);
            ailse = itemView.findViewById(R.id.ailse);
            quantity = itemView.findViewById(R.id.quantity);
            date = itemView.findViewById(R.id.date);
        }

        void bind(CartItemPojo cartItemPojo) {
            title.setText(cartItemPojo.getName());
            category.setText(cartItemPojo.getCategory());
            ailse.setText(cartItemPojo.getLocation().getAilse());
            quantity.setText(String.valueOf(cartItemPojo.getQuantity()));
            date.setText(cartItemPojo.getDate().toString());
        }
    }
}
