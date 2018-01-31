package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ProductCatalogueCache {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String productUpc;
    public String title;
    public String sizeAmount;
    public String sizeUnit;
    public String sizeDisplay;
    public String imageUrl;
    public String thumbnailUrl;
    public int categoryId;
    public String categoryName;
    public int sellOnClickList;
    public String countryOfOrigin;
    public String soldBy;
    public String orderBy;
    public boolean belowMinAdvPrice;
    public boolean ageRestricted;

    public ProductCatalogueCache(String productUpc, String title, String sizeAmount, String sizeUnit,
                                 String sizeDisplay, String imageUrl, String thumbnailUrl, int categoryId,
                                 String categoryName, int sellOnClickList, String countryOfOrigin, String soldBy,
                                 String orderBy, boolean belowMinAdvPrice, boolean ageRestricted) {
        this.productUpc = productUpc;
        this.title = title;
        this.sizeAmount = sizeAmount;
        this.sizeUnit = sizeUnit;
        this.sizeDisplay = sizeDisplay;
        this.imageUrl = imageUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.sellOnClickList = sellOnClickList;
        this.countryOfOrigin = countryOfOrigin;
        this.soldBy = soldBy;
        this.orderBy = orderBy;
        this.belowMinAdvPrice = belowMinAdvPrice;
        this.ageRestricted = ageRestricted;
    }
}
