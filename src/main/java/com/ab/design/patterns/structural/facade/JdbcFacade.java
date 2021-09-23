package com.ab.design.patterns.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton dbSingleton = null;

    public JdbcFacade() {
        dbSingleton = DbSingleton.getInstance();
    }


    public int createTable() {
        int count = 0;
        try {
            Connection conn = dbSingleton.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                    "City VARCHAR(20))");
            //System.out.println("Table Created!!");
            sta.close();
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = dbSingleton.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName,City) " +
                    "values (1,'132 tola','up')");
            //System.out.println( count + " Record Created!!");
            sta.close();
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getRecords() {
        List<Address> addressList = new ArrayList<>();
        try {
            Connection conn = dbSingleton.getConnection();
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery("Select * from Address");
            while (resultSet.next()){
                //System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                Address address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));
                addressList.add(address);
            }
            resultSet.close();
            sta.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addressList;
    }
}
