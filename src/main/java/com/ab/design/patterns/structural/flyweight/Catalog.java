package com.ab.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    private Map<String, Item> itemsMap = new HashMap<>();

    public Item lookUp(String itemName){
        if(!itemsMap.containsKey(itemName)){
            itemsMap.put(itemName,new Item(itemName));
        }
        return itemsMap.get(itemName);
    }

    public int totalItemsMade(){
        return itemsMap.size();
    }
}
