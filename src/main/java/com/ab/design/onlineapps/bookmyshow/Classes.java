package com.ab.design.onlineapps.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Classes {
}

abstract class User {
    private static int idCounter=0;
    private int id;
    private String name;

    public User(String name) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//registered user can do everything
class RegisteredUser extends User {
    public List<Ticket> bookingHistory;

    public RegisteredUser(String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
    }
    public void cancelTicket(Ticket ticket){}
}
//guest user can only browse movies
class GuestUser extends User {
    public GuestUser(String name) {
        super(name);
    }

    public void register(String username, String password){}
}
