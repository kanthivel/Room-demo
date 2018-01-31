package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class WeeklyAdItem {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int id;
    public String divisionNumber;
    public String storeNumber;
    public String weeklyAdId;
    public String title;
    public String description;
    public String categoryId;
    public String categoryName;
    public String imageUrl;
    public String thumbNailUrl;
    public String price;
    public boolean canAddToList;
    public boolean isFeaturedItem;
    public int rankOrder;
    public int startDate;
    public int endDate;
    public String primaryUpc;
    public String secondaryUpcs;

    public WeeklyAdItem(int _id, int id, String divisionNumber, String storeNumber, String weeklyAdId,
                        String title, String description, String categoryId, String categoryName,
                        String imageUrl, String thumbNailUrl, String price, boolean canAddToList,
                        boolean isFeaturedItem, int rankOrder, int startDate, int endDate,
                        String primaryUpc, String secondaryUpcs) {
        this._id = _id;
        this.id = id;
        this.divisionNumber = divisionNumber;
        this.storeNumber = storeNumber;
        this.weeklyAdId = weeklyAdId;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.imageUrl = imageUrl;
        this.thumbNailUrl = thumbNailUrl;
        this.price = price;
        this.canAddToList = canAddToList;
        this.isFeaturedItem = isFeaturedItem;
        this.rankOrder = rankOrder;
        this.startDate = startDate;
        this.endDate = endDate;
        this.primaryUpc = primaryUpc;
        this.secondaryUpcs = secondaryUpcs;
    }
}
