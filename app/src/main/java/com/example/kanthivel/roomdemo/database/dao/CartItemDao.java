package com.example.kanthivel.roomdemo.database.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.kanthivel.roomdemo.database.entity.CartItem;
import com.example.kanthivel.roomdemo.model.CartItemPojo;

import java.util.List;

@Dao
public interface CartItemDao {

    @Query("Select * from cartitem JOIN Product on CartItem.upc == Product.id and " +
            "Product.storeNumber = :storeNumber and Product.divisionNumber = :divisionNumber")
    LiveData<List<CartItemPojo>> getCartItems(int storeNumber, int divisionNumber);

    @Query("Delete from CartItem")
    void deleteAll();

    @Insert
    void insert(CartItem cartItem);

    @Delete()
    void delete(CartItem item);
}
