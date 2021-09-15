package com.ab.design.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("shiv");
        names.add("ganesh");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("Names size " +names.size());
    }
}
