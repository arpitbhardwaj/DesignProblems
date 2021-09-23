package com.ab.design.patterns.behavioral.templatemethod;

/**
 * @author Arpit Bhardwaj
 *
 * Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes.
 * The overall structure and sequence of the algorithm is preserved by the parent class.
 */


public class OrderTemplateMethodDemo {
    public static void main(String[] args) {
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        OrderTemplate storeOrder= new StoreOrder();
        storeOrder.processOrder();
    }
}
