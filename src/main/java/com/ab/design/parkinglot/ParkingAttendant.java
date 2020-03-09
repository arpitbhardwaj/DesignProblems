package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public class ParkingAttendant extends Account {
    //additional responsibility
    public boolean processTickets(String ticket){
        return true;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}
