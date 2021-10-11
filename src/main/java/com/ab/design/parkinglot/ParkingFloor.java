package com.ab.design.parkinglot;

import java.util.HashMap;

/**
 * @author Arpit Bhardwaj
 */
public class ParkingFloor {

    private String name;
    private HashMap<String, CompactSpot> compactSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private ParkingDisplayBoard displayBoard;
    private int freeCompactSpotCount;
    private int freeLargeSpotCount;
    private boolean full;

    public ParkingFloor(String name) {
        this.name = name;
        freeCompactSpotCount = 2;
        freeLargeSpotCount = 2;
    }

    public void addParkingSpot(ParkingSpot spot){
        switch (spot.getType()) {
            case COMPACT:
                compactSpots.put(spot.getNumber(), (CompactSpot) spot);
                break;
            case LARGE:
                largeSpots.put(spot.getNumber(), (LargeSpot) spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle,ParkingSpot spot){
        spot.assignVehicle(vehicle);
        switch (spot.getType()) {
            case COMPACT:
                updateDisplayBoardForCompact(spot);
                break;
            case LARGE:
                updateDisplayBoardForLarge(spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    private void updateDisplayBoardForCompact(ParkingSpot spot) {
        if (this.displayBoard.getCompactFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : compactSpots.keySet()) {
                if (compactSpots.get(key).isFree()) {
                    this.displayBoard.setCompactFreeSpot(compactSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    public void updateDisplayBoardForLarge(ParkingSpot spot){
        if (this.displayBoard.getLargeFreeSpot().getNumber() == spot.getNumber()) {
            // find another free compact parking and assign to displayBoard
            for (String key : largeSpots.keySet()) {
                if (largeSpots.get(key).isFree()) {
                    this.displayBoard.setLargeFreeSpot(largeSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    public void freeSpot(ParkingSpot spot){
        spot.removeVehicle();
        switch (spot.getType()) {
            case COMPACT:
                freeCompactSpotCount++;
                break;
            case LARGE:
                freeLargeSpotCount++;
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public boolean isFull() {
        return full;
    }
}
