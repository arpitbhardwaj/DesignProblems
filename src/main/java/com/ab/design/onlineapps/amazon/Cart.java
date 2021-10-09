package com.ab.design.onlineapps.amazon;

import java.util.List;

public class Cart {
    private List<Item> items;

    public boolean addItem(Item item){return false;}

    public boolean removeItem(Item item){return false;}

    public boolean updateItemQuantity(Item item, int quatity){return false;}

    public List<Item> getItems(){return items;}

    public boolean checkout(){
        //creates order
        //start shipping process
        return false;
    }
}
