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

    public void print() {
        System.out.println("Дом №" + homeNumber + " Этажей: " + floors.length);
    }
}
