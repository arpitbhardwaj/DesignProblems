package com.ab.design.patterns.behavioral.iterator;

import java.util.Iterator;

public class CustomIteratorDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("harley");
        bikeRepository.addBike("passion");
        bikeRepository.addBike("bullet");

        Iterator<String> iterator = bikeRepository.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
