package com.example.kanthivel.roomdemo.model;

import android.arch.persistence.room.Embedded;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartItemPojo {
    public int upc;
    public int quantity;
    public String splInstruction;
    public boolean allowSubstitution;
    public String name;
    public int price;
    public int splPrice;
    public boolean ageRestricted;
    public String soldby;
    public String category;
    public Date date;
    @Embedded
    public Location location;

    @Override
    public String toString() {
        return "CartItemPojo{" +
                "upc=" + upc +
                ", quantity=" + quantity +
                ", splInstruction='" + splInstruction + '\'' +
                ", allowSubstitution=" + allowSubstitution +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", splPrice=" + splPrice +
                ", ageRestricted=" + ageRestricted +
                ", soldby='" + soldby + '\'' +
                ", category='" + category + '\'' +
                ", location=" + location +
                '}';
    }
}
