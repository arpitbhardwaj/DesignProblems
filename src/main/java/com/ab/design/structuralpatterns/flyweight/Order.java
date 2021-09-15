package com.ab.design.structuralpatterns.flyweight;

//order has extrinsic values which can change like order number
public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOder(){
        System.out.println("Ordering " + this.item + "for order number " + this.orderNumber);
    }
}
