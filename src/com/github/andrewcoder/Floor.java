package com.github.andrewcoder;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Этаж №" + floorNumber + " Кол-во квартир: " + flats.length);
    }

    public String toString() {
        return Arrays.toString(flats);
    }
}
