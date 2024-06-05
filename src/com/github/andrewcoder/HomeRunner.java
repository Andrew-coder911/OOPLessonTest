package com.github.andrewcoder;

import java.util.Arrays;

//Представить в виде классов и их композиции следующую модель.
//- Каждый дом содержит свой номер (int), и множество этажей (массив).
//- Каждый этаж содержит номер этажа (int), и множество квартир (массив).
//- Каждая квартира содержит свой номер (int), и множество комнат (массив).
//- Каждая комната содержит поле проходная она или нет (boolean).
//В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
//Например, метод print класса этаж должен выводить на консоль:
//“Этаж 2, количество квартир 18”
//Создание всех объектов вынести в отдельный класс с методом main.
//Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
// и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
public class HomeRunner {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room[] rooms = {room1, room2};

        Flat flat = new Flat(194,rooms);
        Flat flat1 = new Flat(129, rooms);
        Flat[] flats = new Flat[]{flat, flat1};

        Floor floor = new Floor(3, flats);
        Floor floor1 = new Floor(4, flats);
        Floor[] floors = new Floor[]{floor, floor1};

        Home home = new Home(10, rooms, flats, floors);
        printAllInformation(home);
    }

    public static void printAllInformation(Home home) {
        home.print();
        for (int i = 0; i < home.getFloors().length; i++) {
            Floor floor = home.getFloors()[i];
            System.out.println(Arrays.toString(home.getFloors()));
        }
    }

}
