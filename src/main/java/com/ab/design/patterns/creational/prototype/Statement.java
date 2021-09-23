package com.ab.design.patterns.creational.prototype;

import java.util.List;

public class Statement implements Cloneable{

    private String sql;
    private List<String> parameters;
    public Statement(String sql, List<String> parameters) {
        this.sql = sql;
        this.parameters = parameters;
    }

    /*@Override
    protected Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    //Implementing our own cloneable to get rid of type cast
    //if you don't implement Cloneable then super.clone() throws CloneNotSupportedException
    public Statement clone(){
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
