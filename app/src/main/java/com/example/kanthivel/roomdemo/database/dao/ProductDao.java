package com.example.kanthivel.roomdemo.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.kanthivel.roomdemo.database.entity.Product;

import java.util.List;

@Dao
public interface ProductDao {

    @Query("Select * from Product where storeNumber = :storeNumber and divisionNumber = :divisionNumber")
    List<Product> getProducts(int storeNumber, int divisionNumber);

    @Query("Delete from Product")
    void deleteAllProducts();

    @Insert
    void insert(Product product);

    @Delete()
    void delete(Product item);
}
