package com.github.andrewcoder;

public class Room {
    boolean enter;

    public Room(boolean enter) {
        this.enter = enter;
    }

    public boolean checkpoint() {
        return enter;
    }

    public void print(){
        System.out.println("Room checkpointed? - " + enter);
    }
}
