package com.ab.design.patterns.structural.flyweight;

public class InventoryFlyweightDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Adidas Shoes", 564);
        inventorySystem.takeOrder("Nike Shoes", 534);
        inventorySystem.takeOrder("Adidas Shoes", 464);
        inventorySystem.takeOrder("Nike Shoes", 524);
        inventorySystem.takeOrder("Adidas Shoes", 964);
        inventorySystem.takeOrder("Nike Shoes", 504);

        inventorySystem.processOrders();

        System.out.println(inventorySystem.report());

    }
}
