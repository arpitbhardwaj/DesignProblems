package com.ab.design.patterns.creational.builder;

/**
 * @author Arpit Bhardwaj
 *
 * The builder design pattern provides a way for you to build complex immutable objects. The process is:
 *
 * 1.The client calls a constructor (or static factory) with all the required parameters and gets a builder object.
 * 2.The client calls setter like methods to set each optional parameter of interest.
 * 3.Finally, the client calls the build method to generate the object which is immutable.
 */


public class LunchOrderBuilderDemo {
    public static void main(String[] args) {

        LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();

        builder.bread("wheat").condiments("lettuce").dressing("mayo");

        LunchOrderBuilder lunchOrderBuilder = builder.build();//build calls return a new instance with all the set attributes
        System.out.println(lunchOrderBuilder);

        builder.meat("turkey");
        System.out.println(builder.build()); //this call returns a new object different from previous one

        System.out.println(lunchOrderBuilder.getBread());
        System.out.println(lunchOrderBuilder.getCondiments());
        System.out.println(lunchOrderBuilder.getDressing());
        System.out.println(lunchOrderBuilder.getMeat());
    }
}
