package com.ab.design.parkinglot;

import java.util.HashMap;

/**
 * @author Arpit Bhardwaj
 */
public class ParkingFloor {

    private String name;
    private HashMap<String,HandicappedSpot> handicappedSpot;
    private HashMap<String,ElectricSpot> electricSpot;
    private ParkingDisplayBoard displayBoard;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot){}

    public void assignVehicleToSpot(Vehicle vehicle,ParkingSpot spot){}

    public void updateDisplayBoardForHandicapped(ParkingSpot spot){}

    //similar other implementation

    public void freeSpot(ParkingSpot spot){

    }
}
