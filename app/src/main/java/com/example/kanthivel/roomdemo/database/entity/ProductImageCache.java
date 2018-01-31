package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ProductImageCache {
    @PrimaryKey(autoGenerate = true)
    int _id;
    String upc;
    int imageRank;
    String imageUrl;
    String thumbnailUrl;

    public ProductImageCache(int _id, String upc, int imageRank, String imageUrl, String thumbnailUrl) {
        this._id = _id;
        this.upc = upc;
        this.imageRank = imageRank;
        this.imageUrl = imageUrl;
        this.thumbnailUrl = thumbnailUrl;
    }
}
