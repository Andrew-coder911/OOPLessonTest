package com.github.andrewcoder;

public class Home {
    private int homeNumber = 16;
    private Room[] rooms;
    private Flat[] flats;
    private Floor[] floors;

    public Home(int homeNumber, Room[] rooms, Flat[] flats, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.rooms = rooms;
        this.flats = flats;
        this.floors = floors;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом №" + homeNumber + " Этажей: " + floors.length + " Квартир: " +
                flats.length + " Комнат: " + rooms.length);
    }
}
