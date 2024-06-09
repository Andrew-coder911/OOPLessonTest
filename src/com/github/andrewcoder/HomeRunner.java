package com.github.andrewcoder;

public class HomeRunner {
    public static void main(String[] args) {
        Room room1 = new Room(false);
        Room room2 = new Room(false);
        Room room3 = new Room(true);
        Room room4 = new Room(true);
        Room[] rooms = {room1, room2};
        Room[] rooms2 = {room3, room4};

        Flat flat1 = new Flat(11, rooms);
        Flat flat2 = new Flat(12, rooms2);
        Flat flat3 = new Flat(13, rooms);
        Flat flat4 = new Flat(14, rooms2);
        Flat[] flats1 = new Flat[]{flat1, flat2};
        Flat[] flats2 = new Flat[]{flat3, flat4};

        Floor floor1 = new Floor(1, flats1);
        Floor floor2 = new Floor(2, flats2);
        Floor floor3 = new Floor(3, flats1);
        Floor floor4 = new Floor(4, flats2);
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
}
