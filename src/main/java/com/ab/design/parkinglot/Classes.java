package com.ab.design.parkinglot;

public class Classes {
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;
}

class Person {
    private String Name;
    private Address address;
    private String email;
    private String phone;
}

class ParkingTicket{
    String ticketNumber;

    public String getTicketNumber() {
        return ticketNumber;
    }
}
abstract class Account {
    private String username;
    private String password;
    private Person person;

    public abstract boolean resetPassword();
}
class Admin extends Account {
    @Override
    public boolean resetPassword() {
        return false;
    }
}
class ParkingAttendant extends Account {
    public boolean processTickets(String ticket){
        return true;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}