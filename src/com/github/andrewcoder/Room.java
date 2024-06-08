package com.github.andrewcoder;

public class Room {
    boolean enter;

    public Room(boolean enter) {
        this.enter = enter;
    }

    public void print(){
        System.out.println("Room checkpointed? - " + enter);
    }
}
