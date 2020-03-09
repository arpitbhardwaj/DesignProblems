package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public class Vehicle {
    private VehicleType type;
    private String plateNumber;
    private String ticket;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public void assignTicket(String ticket) {
        this.ticket = ticket;
    }
}

class Bike extends Vehicle{

    public Bike() {
        super(VehicleType.BIKE);
    }
}

//similar other implementation
