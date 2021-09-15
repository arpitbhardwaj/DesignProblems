package com.ab.design.structuralpatterns.facade;

import java.util.List;

public class JdbcFacadeDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("Table Created!!");
        jdbcFacade.insertIntoTable();
        System.out.println("Record Created!!");
        List<Address> addressList = jdbcFacade.getRecords();
        for (Address address:addressList
             ) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }
    }
}
