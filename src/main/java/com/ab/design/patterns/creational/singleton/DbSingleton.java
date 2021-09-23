package com.ab.design.patterns.creational.singleton;

/**
 * @author Arpit Bhardwaj
 *
 *  Double-checked locking design pattern
 *      reduces the number of lock acquisitions by simply checking the locking condition beforehand
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private DbSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn != null){
            throw new RuntimeException("Use getConnection() method to create");
        }
        //to make safe from reflection and serialization
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    /*private static DbSingleton instance = new DbSingleton();
    public static DbSingleton getInstance(){
        return instance;
    }*/

    //Lazy Loading
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;

    public static DbSingleton getInstance(){
        if(instance == null){
            //to make safe from multi threading
            synchronized (DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if (conn == null) {
            synchronized (DbSingleton.class){
                if (conn == null){
                    String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
