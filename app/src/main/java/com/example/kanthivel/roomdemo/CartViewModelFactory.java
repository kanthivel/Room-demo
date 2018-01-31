package com.example.kanthivel.roomdemo;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.kanthivel.roomdemo.database.CouponsDatabase;

public class CartViewModelFactory implements ViewModelProvider.Factory {
    private CouponsDatabase database;

    public CartViewModelFactory(Application application) {
        this.database = CouponsDatabase.getCouponsDatabase(application);
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new CartViewModel(database);
    }
}
