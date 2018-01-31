package com.example.kanthivel.roomdemo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ShoppingListItem {
    private final long id;
    private final String shoppingListItemId;
    private final boolean belowMinAdvPrice;
    private final long weeklyAdId;
    private final boolean usesEachPricing;
    private final int promoPriceValue;
    private final int regularPriceValue;
    private final int regularUnitPrice;
    private final int promoUnitPrice;
    private final String countryOfOrigin;
    private final String aisleDescription;
    private final Date yellowTagEndDate;
    private final Date yellowTagStartDate;
    private final String yellowTagPrice;
    private final String whiteTagPrice;
    private final Date circularItemEndDate;
    private final Date circularItemStartDate;
    private final String price;
    private final boolean circularIndicator;
    private final String upcNumber;
    private final String smallImageFileUri;
    private final String imageFileUri;
    private final Date circularExpirationDate;
    private final int syncAction;
    private final Date lastUpdate;
    private final String sourceId;
    private final String source;
    private final String size;
    private final String description;
    private final int type;
    private final int quantity;
    private final String productName;
    private final String name;
    private final boolean checkedStatus;
    private final String categoryName;
    private final String categoryId;
    private final String shoppingListId;
    private final long shoppingListRowId;

    public ShoppingListItem(long id,
                            String shoppingListItemId,
                            long shoppingListRowId,
                            String shoppingListId,
                            String categoryId,
                            String categoryName,
                            boolean checkedStatus,
                            String name,
                            String productName,
                            int quantity,
                            int type,
                            String description,
                            String size,
                            String source,
                            String sourceId,
                            Date lastUpdate,
                            int syncAction,
                            Date circularExpirationDate,
                            String imageFileUri,
                            String smallImageFileUri,
                            String upcNumber,
                            boolean circularIndicator,
                            String price,
                            Date circularItemStartDate,
                            Date circularItemEndDate,
                            String whiteTagPrice,
                            String yellowTagPrice,
                            Date yellowTagStartDate,
                            Date yellowTagEndDate,
                            String aisleDescription,
                            String countryOfOrigin,
                            int promoUnitPrice,
                            int regularUnitPrice,
                            int regularPriceValue,
                            int promoPriceValue,
                            boolean usesEachPricing,
                            long weeklyAdId,
                            boolean belowMinAdvPrice) {
        this.id = id;
        this.shoppingListItemId = shoppingListItemId;
        this.shoppingListRowId = shoppingListRowId;
        this.shoppingListId = shoppingListId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.checkedStatus = checkedStatus;
        this.name = name;
        this.productName = productName;
        this.quantity = quantity;
        this.type = type;
        this.description = description;
        this.size = size;
        this.source = source;
        this.sourceId = sourceId;
        this.lastUpdate = lastUpdate;
        this.syncAction = syncAction;
        this.circularExpirationDate = circularExpirationDate;
        this.imageFileUri = imageFileUri;
        this.smallImageFileUri = smallImageFileUri;
        this.upcNumber = upcNumber;
        this.circularIndicator = circularIndicator;
        this.price = price;
        this.circularItemStartDate = circularItemStartDate;
        this.circularItemEndDate = circularItemEndDate;
        this.whiteTagPrice = whiteTagPrice;
        this.yellowTagPrice = yellowTagPrice;
        this.yellowTagStartDate = yellowTagStartDate;
        this.yellowTagEndDate = yellowTagEndDate;
        this.aisleDescription = aisleDescription;
        this.countryOfOrigin = countryOfOrigin;
        this.promoUnitPrice = promoUnitPrice;
        this.regularUnitPrice = regularUnitPrice;
        this.regularPriceValue = regularPriceValue;
        this.promoPriceValue = promoPriceValue;
        this.usesEachPricing = usesEachPricing;
        this.weeklyAdId = weeklyAdId;
        this.belowMinAdvPrice = belowMinAdvPrice;
    }

    @Override
    public String toString() {
        return "ShoppingListItem{" +
                "rowId=" + id +
                ", shoppingListItemId='" + shoppingListItemId + '\'' +
                ", belowMinAdvPrice=" + belowMinAdvPrice +
                ", weeklyAdId=" + weeklyAdId +
                ", usesEachPricing=" + usesEachPricing +
                ", promoPriceValue=" + promoPriceValue +
                ", regularPriceValue=" + regularPriceValue +
                ", regularUnitPrice=" + regularUnitPrice +
                ", promoUnitPrice=" + promoUnitPrice +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", aisleDescription='" + aisleDescription + '\'' +
                ", yellowTagEndDate=" + yellowTagEndDate +
                ", yellowTagStartDate=" + yellowTagStartDate +
                ", yellowTagPrice='" + yellowTagPrice + '\'' +
                ", whiteTagPrice='" + whiteTagPrice + '\'' +
                ", circularItemEndDate=" + circularItemEndDate +
                ", circularItemStartDate=" + circularItemStartDate +
                ", price='" + price + '\'' +
                ", circularIndicator=" + circularIndicator +
                ", upcNumber='" + upcNumber + '\'' +
                ", smallImageFileUri='" + smallImageFileUri + '\'' +
                ", imageFileUri='" + imageFileUri + '\'' +
                ", circularExpirationDate=" + circularExpirationDate +
                ", syncAction=" + syncAction +
                ", lastUpdate=" + lastUpdate +
                ", sourceId='" + sourceId + '\'' +
                ", source='" + source + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                ", productName='" + productName + '\'' +
                ", name='" + name + '\'' +
                ", checkedStatus=" + checkedStatus +
                ", categoryName='" + categoryName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", shoppingListId='" + shoppingListId + '\'' +
                ", shoppingListRowId=" + shoppingListRowId +
                '}';
    }
}
