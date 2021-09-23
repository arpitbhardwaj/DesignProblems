package com.ab.design.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {
        if(index == bikes.length){
            int length = bikes.length;
            String[] newBikes = Arrays.copyOf(bikes,length + 5);
            bikes = newBikes;
            newBikes = null;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        //implement Iterator interface anonymously
        Iterator<String> iterator = new Iterator<>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }
}
