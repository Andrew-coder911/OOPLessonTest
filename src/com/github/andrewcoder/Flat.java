package com.github.andrewcoder;

public class Flat {
    private int flatNumber;
    private Room rooms[];

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира №" + flatNumber + " Кол-во комнат: " + rooms.length);
    }

    public String toString() {
        return rooms.toString();
    }
}
