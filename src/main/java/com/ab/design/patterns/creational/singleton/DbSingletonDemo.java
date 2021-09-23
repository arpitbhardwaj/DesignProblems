package com.ab.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        /*System.out.println(dbSingleton);

        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(dbSingleton);

        if(dbSingleton == anotherInstance){
            System.out.println("Both are same");
        }*/
        System.out.println(dbSingleton);
        Connection conn = getConnection(dbSingleton);

        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                    "City VARCHAR(20))");
            System.out.println("Table Created!!");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection anotherConn = getConnection(dbSingleton);
    }

    private static Connection getConnection(DbSingleton dbSingleton) {
        long timeBefore = System.currentTimeMillis();
        Connection conn = dbSingleton.getConnection();
        long timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefore);
        return conn;
    }
}
