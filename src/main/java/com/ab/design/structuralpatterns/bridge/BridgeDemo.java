package com.ab.design.structuralpatterns.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Arpit Bhardwaj
 *
 * Allows to decouple an abstraction from its implementation so that the two can vary independently
 *
 * Bridge design pattern solve:
 *      An abstraction and its implementation should be defined and extended independently of each other.
 *      A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.
 */
public class BridgeDemo {
    public static void main(String[] args) throws SQLException {
        //DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

        Connection conn = DriverManager.getConnection(dbUrl);

        Statement statement = conn.createStatement();

        int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                "City VARCHAR(20))");
        System.out.println("Table Created!!");

        statement.close();
    }
}
