package com.ab.design.controlsystem.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public abstract class Vehicle {
    private VehicleType type;
    private String plateNumber;
    private ParkingTicket ticket;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }

    public VehicleType getType() {
        return type;
    }
}

class Car extends Vehicle {
    public Car() {
        super(VehicleType.CAR);
    }
}

class Van extends Vehicle {
    public Van() {
        super(VehicleType.VAN);
    }
}

class Truck extends Vehicle {
    public Truck() {
        super(VehicleType.TRUCK);
    }
}
//similar other implementation
