package com.example.kanthivel.roomdemo.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Product.class,
        parentColumns = "id",
        childColumns = "upc", onDelete = CASCADE))
public class CartItem {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public int upc;
    public int quantity;
    public String splInstruction;
    public boolean allowSubstitution;
    public Date date;

    public CartItem(int upc, int quantity, String splInstruction, boolean allowSubstitution, Date date) {
        this.upc = upc;
        this.quantity = quantity;
        this.splInstruction = splInstruction;
        this.allowSubstitution = allowSubstitution;
        this.date = date;
    }
}
