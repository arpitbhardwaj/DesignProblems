package com.ab.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Template Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2.5 Hrs");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Template Book");
        book.setPrice(19.95);
        book.setNoOfPages(99);
        items.put("Book", book);
    }
}
