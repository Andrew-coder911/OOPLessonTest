package com.github.andrewcoder;

public class Room {
    boolean enter;

    public Room(boolean enter) {
        this.enter = enter;
    }

    @Override
    public String toString(){
        String print = "    Room checkpointed? - ";
        return  print + enter;
    }
}
