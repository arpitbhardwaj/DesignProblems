package com.ab.design.onlineapps.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private static int idCounter=0;
    private int id;
    private String name;
    private String location;
    private int capacity;
    private List<Show> shows;       //Theatre is running multiple shows

    public Theatre(String name, String location, int capacity) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public void updateShow(Show oldShow, Show newShow){}

    public List<Show> getShows(){
        return shows;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

}
