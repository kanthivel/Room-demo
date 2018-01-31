package com.example.kanthivel.roomdemo.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.database.Cursor;

import com.example.kanthivel.roomdemo.model.ShoppingListItem;

import java.util.List;

@Dao
public interface ShoppingListDao {

    //This will return the List of shopping items

    @Query("SELECT ShoppingListItem.id, ShoppingListItem.shoppingListId, ShoppingListItem.ShoppingListItemId, " +
            "ShoppingListItem.categoryName, ShoppingListItem.checkedStatus, ShoppingListItem.itemName, ShoppingListItem.productName," +
            " ShoppingListItem.quantity, ShoppingListItem.type, ShoppingListItem.description, ShoppingListItem.size, " +
            "ShoppingListItem.imageFileUri, ShoppingListItem.smallImageFileUri, ShoppingListItem.source, ShoppingListItem.sourceId," +
            " ShoppingListItem.lastUpdate, ShoppingListItem.syncAction, ShoppingListItem.shoppingListRowId, ShoppingListItem.categoryId, " +
            "ShoppingListItem.upcNumber, ShoppingListItem.circularExpirationDate, WeeklyAdItem.startDate, WeeklyAdItem.endDate," +
            " WeeklyAdItem.price, WeeklyAdItem.id as weeklyAdId, case when WeeklyAdItem._id is not null then 1 else 0 end as circularIndicator, " +
            "ProductPriceCache.regularPrice, ProductPriceCache.promoPrice, ProductPriceCache.regularPriceValue, ProductPriceCache.promoPriceValue, " +
            "ProductPriceCache.expirationDate as ppexpirationDate, ProductPriceCache.promoUnitPrice, ProductPriceCache.regularUnitPrice, usesEachPricing, " +
            "pcc.countryOfOrigin, pcc.belowMinAdvPrice, IFNULL(plc.aisleDesc, 'Aisle may vary') as aisleDesc, IFNULL(plc.aisleSortValue, 'ZZZZ') as aisleSort,  " +
            "case when pcc.soldBy = 'Weight' and pcc.orderBy = 'Unit' then 1 else 0 end as usesEachPricing FROM ShoppingListItem " +
            "LEFT JOIN ( SELECT * FROM WeeklyAdItem WHERE WeeklyAdItem.divisionNumber = :divisionNumber  AND WeeklyAdItem.storeNumber = :storeNumber  GROUP BY WeeklyAdItem.title ," +
            " WeeklyAdItem.categoryId ) WeeklyAdItem ON  upper( WeeklyAdItem.title ) = upper( ShoppingListItem.itemName )  " +
            "AND ShoppingListItem.categoryId = WeeklyAdItem.categoryId LEFT JOIN ProductPriceCache on ProductPriceCache.upc = ShoppingListItem.upcNumber " +
            "AND ProductPriceCache.division =:divisionNumber AND ProductPriceCache.store =:storeNumber LEFT JOIN ( SELECT DISTINCT ProductCatalogueCache.productUpc, " +
            "ProductCatalogueCache.countryOfOrigin, ProductCatalogueCache.orderBy, ProductCatalogueCache.soldBy, " +
            "ProductCatalogueCache.belowMinAdvPrice FROM ProductCatalogueCache GROUP BY productUpc) as pcc on pcc.productUpc = ShoppingListItem.upcNumber " +
            "LEFT JOIN (SELECT min(ProductLocationCache.rank), ProductLocationCache.upc, ProductLocationCache.aisleDesc, ProductLocationCache.aisleNumber," +
            " ProductLocationCache.aisleSortValue FROM ProductLocationCache WHERE ProductLocationCache.division =:divisionNumber AND ProductLocationCache.storeNumber =:storeNumber " +
            "GROUP BY ProductLocationCache.upc) as plc on plc.upc = ShoppingListItem.upcNumber  WHERE shoppingListRowId = :rowID  AND syncAction<>3  " +
            "ORDER BY ShoppingListItem.checkedStatus ASC,aisleSort ASC, ShoppingListItem.itemName")
    List<ShoppingListItem> getShoppingListItems(String storeNumber, String divisionNumber, String rowID);

    //Same implementation but it will return cursor

    @Query("SELECT ShoppingListItem.id, ShoppingListItem.shoppingListId, ShoppingListItem.ShoppingListItemId, " +
            "ShoppingListItem.categoryName, ShoppingListItem.checkedStatus, ShoppingListItem.itemName, ShoppingListItem.productName," +
            " ShoppingListItem.quantity, ShoppingListItem.type, ShoppingListItem.description, ShoppingListItem.size, " +
            "ShoppingListItem.imageFileUri, ShoppingListItem.smallImageFileUri, ShoppingListItem.source, ShoppingListItem.sourceId," +
            " ShoppingListItem.lastUpdate, ShoppingListItem.syncAction, ShoppingListItem.shoppingListRowId, ShoppingListItem.categoryId, " +
            "ShoppingListItem.upcNumber, ShoppingListItem.circularExpirationDate, WeeklyAdItem.startDate, WeeklyAdItem.endDate," +
            " WeeklyAdItem.price, WeeklyAdItem.id as weeklyAdId, case when WeeklyAdItem._id is not null then 1 else 0 end as circularIndicator, " +
            "ProductPriceCache.regularPrice, ProductPriceCache.promoPrice, ProductPriceCache.regularPriceValue, ProductPriceCache.promoPriceValue, " +
            "ProductPriceCache.expirationDate as ppexpirationDate, ProductPriceCache.promoUnitPrice, ProductPriceCache.regularUnitPrice, usesEachPricing, " +
            "pcc.countryOfOrigin, pcc.belowMinAdvPrice, IFNULL(plc.aisleDesc, 'Aisle may vary') as aisleDesc, IFNULL(plc.aisleSortValue, 'ZZZZ') as aisleSort,  " +
            "case when pcc.soldBy = 'Weight' and pcc.orderBy = 'Unit' then 1 else 0 end as usesEachPricing FROM ShoppingListItem " +
            "LEFT JOIN ( SELECT * FROM WeeklyAdItem WHERE WeeklyAdItem.divisionNumber = :divisionNumber  AND WeeklyAdItem.storeNumber = :storeNumber  GROUP BY WeeklyAdItem.title ," +
            " WeeklyAdItem.categoryId ) WeeklyAdItem ON  upper( WeeklyAdItem.title ) = upper( ShoppingListItem.itemName )  " +
            "AND ShoppingListItem.categoryId = WeeklyAdItem.categoryId LEFT JOIN ProductPriceCache on ProductPriceCache.upc = ShoppingListItem.upcNumber " +
            "AND ProductPriceCache.division =:divisionNumber AND ProductPriceCache.store =:storeNumber LEFT JOIN ( SELECT DISTINCT ProductCatalogueCache.productUpc, " +
            "ProductCatalogueCache.countryOfOrigin, ProductCatalogueCache.orderBy, ProductCatalogueCache.soldBy, " +
            "ProductCatalogueCache.belowMinAdvPrice FROM ProductCatalogueCache GROUP BY productUpc) as pcc on pcc.productUpc = ShoppingListItem.upcNumber " +
            "LEFT JOIN (SELECT min(ProductLocationCache.rank), ProductLocationCache.upc, ProductLocationCache.aisleDesc, ProductLocationCache.aisleNumber," +
            " ProductLocationCache.aisleSortValue FROM ProductLocationCache WHERE ProductLocationCache.division =:divisionNumber AND ProductLocationCache.storeNumber =:storeNumber " +
            "GROUP BY ProductLocationCache.upc) as plc on plc.upc = ShoppingListItem.upcNumber  WHERE shoppingListRowId = :rowID  AND syncAction<>3  " +
            "ORDER BY ShoppingListItem.checkedStatus ASC,aisleSort ASC, ShoppingListItem.itemName")
    Cursor getShoppingListItemsCursor(String storeNumber, String divisionNumber, String rowID);
}
