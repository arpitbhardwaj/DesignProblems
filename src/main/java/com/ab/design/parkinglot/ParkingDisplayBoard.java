package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public class ParkingDisplayBoard {

    private String id;
    private CompactSpot compactFreeSpot;
    private LargeSpot largeFreeSpot;

    public void showEmptySpotNumber(){
        String message = "";
        if(compactFreeSpot.isFree()){
            message += "Free Compact: " + compactFreeSpot.getNumber();
        } else {
            message += "Compact is full";
        }
        message += System.lineSeparator();

        if(largeFreeSpot.isFree()){
            message += "Free Large: " + largeFreeSpot.getNumber();
        } else {
            message += "Large is full";
        }
        message += System.lineSeparator();

        System.out.println(message);
    }

    public CompactSpot getCompactFreeSpot() {
        return compactFreeSpot;
    }

    public void setCompactFreeSpot(CompactSpot compactFreeSpot) {
        this.compactFreeSpot = compactFreeSpot;
    }

    public LargeSpot getLargeFreeSpot() {
        return largeFreeSpot;
    }

    public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
        this.largeFreeSpot = largeFreeSpot;
    }
}
