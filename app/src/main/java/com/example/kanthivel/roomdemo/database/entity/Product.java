package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.example.kanthivel.roomdemo.model.Location;

@Entity
public class Product {
    @PrimaryKey
    public int id;
    public String name;
    public int price;
    public int splPrice;
    public boolean ageRestricted;

    public Product(int id, String name, int price, int splPrice, boolean ageRestricted, String soldby, String category, Location location) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.splPrice = splPrice;
        this.ageRestricted = ageRestricted;
        this.soldby = soldby;
        this.category = category;
        this.location = location;
    }

    public String soldby;
    public String category;
    @Embedded
    public Location location;
}
