package com.ab.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 * Used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.
 *
 * Prototype design pattern solves problems:
 * How can objects be created so that which objects to create can be specified at run-time?
 * How can dynamically loaded classes be instantiated?
 */

public class PrototypeDemo {

    public static void main(String[] args) {
        String sql = "Select * from movies where title = ?";
        List<String> parameters = new ArrayList<String>();
        parameters.add("Star Wars");

        Statement statement = new Statement(sql,parameters);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());

        Statement anotherStatement = statement.clone();
        //shallow copy
        //Dangerous: the changes done in List elements or record object will be reflected in both statement

        System.out.println(anotherStatement.getSql());
        System.out.println(anotherStatement.getParameters());
    }

}
