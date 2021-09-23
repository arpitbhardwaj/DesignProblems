package com.ab.design.machine.vending;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arpit Bhardwaj
 *
 * Inventory to hold cash and Items inside Vending Machine
 *
 * Adapter pattern is used to create Inventory by wrapping java.util.Map
 */
public class Inventory<E> {
    private Map<E, Integer> inventoryMap = new HashMap<>();

    public void put(E item, int quantity){
        inventoryMap.put(item,quantity);
    }

    public void add(E item){
        if(hasItem(item)){
            int count = inventoryMap.get(item);
            inventoryMap.put(item,count + 1);
        }else{
            inventoryMap.put(item,1);
        }
    }
    public void deduct(E item){
        if(hasItem(item)){
            int count = inventoryMap.get(item);
            inventoryMap.put(item,count - 1);
        }
    }

    public boolean hasItem(E item) {
        return getItemQuantity(item) > 0;
    }

    private int getItemQuantity(E item) {
        Integer value = inventoryMap.get(item);
        return value == null ? 0 : value;
    }
}
