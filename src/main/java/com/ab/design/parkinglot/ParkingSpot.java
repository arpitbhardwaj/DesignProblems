package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public abstract class ParkingSpot {
    private ParkingSpotType spotType;
    private String number;
    private Vehicle vehicle;
    private boolean free;

    public ParkingSpot(ParkingSpotType spotType) {
        this.spotType = spotType;
    }

    public boolean removeVehicle() {
        this.vehicle = null;
        free = true;
        return true;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
        return true;
    }

    protected abstract boolean isFree();

}

class HandicappedSpot extends ParkingSpot{

    public HandicappedSpot() {
        super(ParkingSpotType.HANDICAPPED);
    }

    @Override
    protected boolean isFree() {
        return false;
    }
}

class ElectricSpot extends ParkingSpot{
    public ElectricSpot() {
        super(ParkingSpotType.ELECTRIC);
    }

    @Override
    protected boolean isFree() {
        return false;
    }
}

//similar other implementation