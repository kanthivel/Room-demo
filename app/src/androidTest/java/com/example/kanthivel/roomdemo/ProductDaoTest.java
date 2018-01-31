package com.example.kanthivel.roomdemo;

import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.kanthivel.roomdemo.database.CouponsDatabase;
import com.example.kanthivel.roomdemo.database.entity.Product;
import com.example.kanthivel.roomdemo.model.Location;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ProductDaoTest {
    private CouponsDatabase couponsDatabase;

    @Before
    public void setup() {
        couponsDatabase = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(),
                CouponsDatabase.class).build();
    }

    @After
    public void tearDown() {
        couponsDatabase.close();
    }

    @Test
    public void insertAndRetrieveProductData() {
        int id = ((int) System.currentTimeMillis());
        Product product = new Product(id, "prod6", 34, 12, false,
                "weight", "dairy", new Location("ailse1", 234, 14));
        couponsDatabase.ProductDao().insert(product);

        List<Product> productSelection = couponsDatabase.ProductDao().getProducts(234, 14);
        assertEquals(productSelection.get(0).id, id);
    }
}

