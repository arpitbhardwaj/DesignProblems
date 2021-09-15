package com.ab.design.creationalpatterns.factory;

import java.util.Calendar;
import java.util.TimeZone;
/**
 * @author Arpit Bhardwaj
 *
 */
public class FactoryDemo {
    public static void main(String[] args) {
        //Calendar calendar = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
