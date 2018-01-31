package com.example.kanthivel.roomdemo

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.example.kanthivel.roomdemo.database.CouponsDatabase
import com.example.kanthivel.roomdemo.database.entity.CartItem
import com.example.kanthivel.roomdemo.database.entity.Product
import com.example.kanthivel.roomdemo.model.Location
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@RunWith(AndroidJUnit4::class)
open class CartItemDaoTest {

    private lateinit var couponsDatabase: CouponsDatabase

    @Before
    fun initDb() {
        couponsDatabase = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(),
                CouponsDatabase::class.java).build()
    }

    @After
    fun closeDb() {
        couponsDatabase.close()
    }

    @Test
    fun insertAndRetriveCartDataData() {
        val id = System.currentTimeMillis().toInt()
        val product = Product(id, "prod6", 34, 12, false,
                "weight", "dairy", Location("ailse1", 234, 14))
        val cartItem = CartItem(id, 1, "eqtr", false, Date())
        couponsDatabase.ProductDao().insert(product)
        couponsDatabase.CartItemDao().insert(cartItem)

        var selection = couponsDatabase.CartItemDao().getCartItems(234, 14).value
        assertEquals(selection!![0].getUpc(), id)
    }
}