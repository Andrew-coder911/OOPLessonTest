package com.github.andrewcoder;

import java.util.Random;

public class HomeRunner {
    public static void main(String[] args) {
        Home home = new Home(10,makeFloors(4));
        printAllInformation(home);
    }
    public static void printAllInformation(Home home) {
        home.print();
        for (int i = 0; i < home.getFloors().length; i++) {
            home.getFloors()[i].print();
            for (int j = 0; j < home.getFloors()[i].getFlats().length; j++) {
                home.getFloors()[i].getFlats()[j].print();
                for (int k = 0; k < home.getFloors()[i].getFlats()[j].getRooms().length; k++) {
                    home.getFloors()[i].getFlats()[j].getRooms()[k].print();
                }
            }
        }
    }
    public static Room[] makeRooms() {
        int countRoom = new Random().nextInt(1, 7);
        Room[] rooms = new Room[countRoom];
        for (int i = 0; i < rooms.length; i++) {
            boolean random = new Random().nextBoolean();
            rooms[i] = new Room(random);
        }
        return rooms;
    }
    public static Flat[] makeFlats(int countFlats) {
        Flat[] flats = new Flat[countFlats];
        for (int i = 0; i < flats.length; i++) {
            Room[] rooms = makeRooms();
            flats[i] = new Flat(i + 1, rooms);
        }
        return flats;
    }
    public static Floor[] makeFloors(int floorCount) {
        Floor[] floors = new Floor[floorCount];
        Flat[] flats = makeFlats(3);
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(i + 1, flats);
        }
        return floors;
    }
}
