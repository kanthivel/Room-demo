package com.example.kanthivel.roomdemo.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;

import com.example.kanthivel.roomdemo.database.dao.CartItemDao;
import com.example.kanthivel.roomdemo.database.dao.ProductDao;
import com.example.kanthivel.roomdemo.database.dao.ShoppingListDao;
import com.example.kanthivel.roomdemo.database.entity.CartItem;
import com.example.kanthivel.roomdemo.database.entity.Product;
import com.example.kanthivel.roomdemo.database.entity.ProductCatalogueCache;
import com.example.kanthivel.roomdemo.database.entity.ProductImageCache;
import com.example.kanthivel.roomdemo.database.entity.ProductLocationCache;
import com.example.kanthivel.roomdemo.database.entity.ProductPriceCache;
import com.example.kanthivel.roomdemo.database.entity.ShoppingListItem;
import com.example.kanthivel.roomdemo.database.entity.WeeklyAdItem;
import com.example.kanthivel.roomdemo.database.typeConverters.DateTypeConverter;

@Database(entities = {CartItem.class, Product.class, ProductCatalogueCache.class, ProductImageCache.class,
        ProductLocationCache.class, ShoppingListItem.class, WeeklyAdItem.class, ProductPriceCache.class}, version = 1)
@TypeConverters({DateTypeConverter.class})
public abstract class CouponsDatabase extends RoomDatabase {

    private static CouponsDatabase INSTANCE;

    public abstract CartItemDao CartItemDao();

    public abstract ProductDao ProductDao();

    public abstract ShoppingListDao ShoppingListDao();

    public static CouponsDatabase getCouponsDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), CouponsDatabase.class, "coupons-database")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE CartItem "
                    + " ADD COLUMN date INTEGER");
        }

    };

    public static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {

        }

    };
}
