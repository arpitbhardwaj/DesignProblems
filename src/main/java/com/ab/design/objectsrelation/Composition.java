package com.ab.design.objectsrelation;

/**
 * @author Arpit Bhardwaj
 *
 * Composition is a strong “has-a” relationship because the containing object owns it parts.
 * The objects' lifecycles are tied together.
 * It means that if we destroy the owner object, its members also will be destroyed with it
 *
 * One of the way we can define it by non-static inner classes since it binds all of its instances to the containing class.
 */

public class Composition {
    public static void main(String[] args) {

    }
}

class Building {
    interface Room {
        void doInRoom();
    }

    Room createRoom() {
        return new Room() {
            @Override
            public void doInRoom() {

            }
        };
    }
}
