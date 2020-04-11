package com.ab.design.vending;

/**
 * @author Arpit Bhardwaj
 */
public enum Item {
    COKE ("Coke",20),BISCUIT("Buiskit", 10), NAMKEEN("Namkeen", 15);
    private String name;
    private int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
