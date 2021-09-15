package com.ab.design.structuralpatterns.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ab.design.structuralpatterns.facade.*;

public class JdbcWithoutFacade {
    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        Connection conn = dbSingleton.getConnection();

        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                    "City VARCHAR(20))");
            System.out.println("Table Created!!");
            sta.close();

            sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName,City) " +
                    "values (1,'132 tola','up')");
            System.out.println( count + " Record Created!!");
            sta.close();

            sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery("Select * from Address");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
