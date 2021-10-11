package com.ab.design.controlsystem.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public abstract class ParkingSpot {
    private ParkingSpotType type;
    private String number;
    private Vehicle vehicle;
    private boolean free;

    public ParkingSpot(ParkingSpotType spotType) {
        this.type = spotType;
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

    public ParkingSpotType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}

class CompactSpot extends ParkingSpot {
    public CompactSpot() {
        super(ParkingSpotType.COMPACT);
    }

    @Override
    protected boolean isFree() {
        return false;
    }
}

class LargeSpot extends ParkingSpot {
    public LargeSpot() {
        super(ParkingSpotType.LARGE);
    }

    @Override
    protected boolean isFree() {
        return false;
    }
}