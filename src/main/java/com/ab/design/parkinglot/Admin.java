package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public class Admin extends Account {
    //additional responsibility


    @Override
    public boolean resetPassword() {
        return false;
    }
}
