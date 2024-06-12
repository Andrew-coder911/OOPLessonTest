package com.github.andrewcoder;

public class Home {
    private int homeNumber = 16;
    private Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }
    @Override
    public String toString() {
        return "Дом №" + homeNumber + " Этажей: " + floors.length;
    }
}
