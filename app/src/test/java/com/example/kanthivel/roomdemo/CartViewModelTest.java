package com.example.kanthivel.roomdemo;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.arch.lifecycle.MutableLiveData;

import com.example.kanthivel.roomdemo.database.CouponsDatabase;
import com.example.kanthivel.roomdemo.database.dao.CartItemDao;
import com.example.kanthivel.roomdemo.model.CartItemPojo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CartViewModelTest {

    private String productName = "prod1";
    private int upc = 1;

    @Mock
    private CouponsDatabase database;

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Test
    public void shouldRetrieveCartDataFromDataBase() {
        CartViewModel cartViewModel = new CartViewModel(database);
        CartItemPojo cartItemPojo = CartItemPojo.builder().name(productName).upc(upc).build();
        MutableLiveData<List<CartItemPojo>> liveData = new MutableLiveData<>();
        liveData.setValue(Arrays.asList(cartItemPojo));
        CartItemDao cartItemDao = mock(CartItemDao.class);
        when(database.CartItemDao()).thenReturn(cartItemDao);
        when(cartItemDao.getCartItems(234, 14)).thenReturn(liveData);
        List<CartItemPojo> cartItemList = cartViewModel.getCartItemList().getValue();
        assertEquals(productName, cartItemList.get(0).getName());
        assertEquals(upc, cartItemList.get(0).getUpc());
    }
}
