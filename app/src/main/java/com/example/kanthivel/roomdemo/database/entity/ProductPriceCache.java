package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ProductPriceCache {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String upc;
    public String division;
    public String store;
    public String regularPrice;
    public String promoPrice;
    public int regularUnitPrice;
    public int regularPriceValue;
    public int promoPriceValue;
    public int promoUnitPrice;
    public long expirationDate;
    public boolean isAvailableOnClickList;
    public long cacheTimestamp;

    public ProductPriceCache(int _id, String upc, String division, String store, String regularPrice,
                             String promoPrice, int regularUnitPrice, int regularPriceValue, int promoPriceValue,
                             int promoUnitPrice, long expirationDate, boolean isAvailableOnClickList, long cacheTimestamp) {
        this._id = _id;
        this.upc = upc;
        this.division = division;
        this.store = store;
        this.regularPrice = regularPrice;
        this.promoPrice = promoPrice;
        this.regularUnitPrice = regularUnitPrice;
        this.regularPriceValue = regularPriceValue;
        this.promoPriceValue = promoPriceValue;
        this.promoUnitPrice = promoUnitPrice;
        this.expirationDate = expirationDate;
        this.isAvailableOnClickList = isAvailableOnClickList;
        this.cacheTimestamp = cacheTimestamp;
    }
}
