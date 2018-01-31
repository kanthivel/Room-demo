package com.example.kanthivel.roomdemo.model;

import lombok.Getter;

@Getter
public class Location {

    public String ailse;
    public int storeNumber;
    public int divisionNumber;

    public Location(String ailse, int storeNumber, int divisionNumber) {
        this.ailse = ailse;
        this.storeNumber = storeNumber;
        this.divisionNumber = divisionNumber;
    }

    @Override
    public String toString() {
        return "Location{" +
                "ailse='" + ailse + '\'' +
                ", storeNumber=" + storeNumber +
                ", divisionNumber=" + divisionNumber +
                '}';
    }
}
