package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ShoppingListItem {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String shoppingListItemId;
    public int shoppingListRowId;
    public String shoppingListId;
    public String categoryId;
    public String categoryName;
    public boolean checkedStatus;
    public String itemName;
    public String productName;
    public int quantity;
    public int type;
    public String description;
    public String imageFileUri;
    public String smallImageFileUri;
    public String size;
    public String source;
    public String sourceId;
    public int lastUpdate;
    public int syncAction;
    public int circularExpirationDate;
    public String upcNumber;
    public int usesEachPricing;

    public ShoppingListItem(int id, String shoppingListItemId, int shoppingListRowId, String shoppingListId,
                            String categoryId, String categoryName, boolean checkedStatus, String itemName,
                            String productName, int quantity, int type, String description, String imageFileUri,
                            String smallImageFileUri, String size, String source, String sourceId, int lastUpdate,
                            int syncAction, int circularExpirationDate, String upcNumber, int usesEachPricing) {
        this.id = id;
        this.shoppingListItemId = shoppingListItemId;
        this.shoppingListRowId = shoppingListRowId;
        this.shoppingListId = shoppingListId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.checkedStatus = checkedStatus;
        this.itemName = itemName;
        this.productName = productName;
        this.quantity = quantity;
        this.type = type;
        this.description = description;
        this.imageFileUri = imageFileUri;
        this.smallImageFileUri = smallImageFileUri;
        this.size = size;
        this.source = source;
        this.sourceId = sourceId;
        this.lastUpdate = lastUpdate;
        this.syncAction = syncAction;
        this.circularExpirationDate = circularExpirationDate;
        this.upcNumber = upcNumber;
        this.usesEachPricing = usesEachPricing;
    }
}
