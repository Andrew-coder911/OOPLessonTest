package com.github.andrewcoder;

import java.util.Random;

public class HomeRunner {
    public static void main(String[] args) {
        Room[] rooms = makeRooms(4);
        Room[] rooms2 = makeRooms(5);
        Room[] rooms3 = makeRooms(3);
        Flat[] flats1 = makeFlats(1,rooms);
        Flat[] flats2 = makeFlats(3,rooms3);
        Flat[] flats3 = makeFlats(2,rooms2);
        Floor floor1 = new Floor(1, flats1);
        Floor floor2 = new Floor(2, flats2);
        Floor floor3 = new Floor(3, flats1);
        Floor floor4 = new Floor(4, flats3);
        Floor[] floors = new Floor[]{floor1, floor2, floor3, floor4};

        Home home = new Home(10,floors);
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
    public static Room[] makeRooms(int countRoom) {
        Room[] rooms = new Room[countRoom];
        for (int i = 0; i < rooms.length; i++) {
            int random = new Random().nextInt(2, 4);
            if (i % random == 0) {
                rooms[i] = new Room(true);
            } else {
                rooms[i] = new Room(false);
            }
        }
        return rooms;
    }
    public static Flat[] makeFlats(int countFlats, Room[] rooms) {
        Flat[] flats = new Flat[countFlats];
        for (int i = 0; i < flats.length; i++) {
            int random = new Random().nextInt(2, 4);
            if (i % random == 0) {
                flats[i] = new Flat(i + 1, rooms);
            } else {
                flats[i] = new Flat(i + 1, rooms);
            }
        }
        return flats;
    }
}
