package com.github.andrewcoder;

import java.util.Random;

public class HomeRunner {
    public static void main(String[] args) {
        Home home = new Home(10,makeFloors(4));
        printAllInformation(home);
    }
    public static void printAllInformation(Home home) {
        System.out.println(home.toString());;
        for (int i = 0; i < home.getFloors().length; i++) {
            System.out.println(home.getFloors()[i].toString());
            for (int j = 0; j < home.getFloors()[i].getFlats().length; j++) {
                System.out.println(home.getFloors()[i].getFlats()[j].toString());;
                for (int k = 0; k < home.getFloors()[i].getFlats()[j].getRooms().length; k++) {
                    System.out.println(home.getFloors()[i].getFlats()[j].getRooms()[k].toString());
                }
            }
        }
    }
    public static Room[] makeRooms() {
        int countRoom = new Random().nextInt(1, 4);
        Room[] rooms = new Room[countRoom];
        for (int i = 0; i < rooms.length; i++) {
            boolean random = new Random().nextBoolean();
            rooms[i] = new Room(random);
        }
        return rooms;
    }
    public static Flat[] makeFlats() {
        int countFlats = new Random().nextInt(1,4);
        Flat[] flats = new Flat[countFlats];
        for (int i = 0; i < flats.length; i++) {
            Room[] rooms = makeRooms();
            flats[i] = new Flat(i + 1, rooms);
        }
        return flats;
    }
    public static Floor[] makeFloors(int floorCount) {
        Floor[] floors = new Floor[floorCount];
        for (int i = 0; i < floors.length; i++) {
            Flat[] flats = makeFlats();
            floors[i] = new Floor(i + 1, flats);
        }
        return floors;
    }
}
