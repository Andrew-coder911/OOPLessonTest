package com.github.andrewcoder;

public class Flat {
    private int flatNumber;
    private Room rooms[];

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
    @Override
    public String toString() {
        return "  Квартира №" + flatNumber + " Кол-во комнат: " + rooms.length;
    }
}
