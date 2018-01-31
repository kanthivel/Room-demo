package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ProductLocationCache {
    @PrimaryKey(autoGenerate = true)
    int _id;
    String upc;
    String aisleNumber;
    String aisleDesc;
    String aisleSide;
    String aisleSortValue;
    String storeNumber;
    String division;
    long timestamp;
    int rank;

    public ProductLocationCache(int _id, String upc, String aisleNumber, String aisleDesc, String aisleSide,
                                String aisleSortValue, String storeNumber, String division, int rank, long timestamp) {
        this._id = _id;
        this.upc = upc;
        this.aisleNumber = aisleNumber;
        this.aisleDesc = aisleDesc;
        this.aisleSide = aisleSide;
        this.aisleSortValue = aisleSortValue;
        this.storeNumber = storeNumber;
        this.division = division;
        this.rank = rank;
        this.timestamp = timestamp;
    }
}
