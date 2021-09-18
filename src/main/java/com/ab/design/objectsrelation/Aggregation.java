package com.ab.design.objectsrelation;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 *
 * Agregation is a weak “has-a” relationship because the containing object and its parts can exist independently of each other.
 * The objects' lifecycles aren't tied together.
 *
 * One of the way we can define it by static inner classes.
 */
public class Aggregation {
    class Wheel {}

    class Car {
        List<Wheel> wheels;
    }

    public static void main(String[] args) {

    }
}

class Car {
    List<Wheel> wheel;
    static class Wheel {}
}
