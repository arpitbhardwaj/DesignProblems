package com.ab.design.structuralpatterns.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orderList = new ArrayList<>();

    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber, item);
        orderList.add(order);
    }

    void processOrders(){
        //throws concurrent modification exception
        /*for (Order order:orderList
             ) {
            order.processOder();
            orderList.remove(order);
        }*/

        Iterator<Order> orderIterator = orderList.iterator();

        while (orderIterator.hasNext()){
            orderIterator.next().processOder();
            orderIterator.remove();
        }
    }

    String report(){
        return "\n Total item objects made : " + catalog.totalItemsMade();
    }
}
