package com.ab.design.parkinglot;

/**
 * @author Arpit Bhardwaj
 */
public abstract class Account {
    private String username;
    private String password;
    private Person person;

    public abstract boolean resetPassword();
}
