package com.ab.design.behavioralpatterns.memento;

import java.io.*;

/**
 * @author Arpit Bhardwaj
 *
 * Provides the ability to restore an object to its previous state (undo via rollback).
 */

public class MementoDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setName("Arpit Bhardwaj");
        employee.setAddress("BNB Layout");
        employee.setPhone("56565656");

        serialize(employee);
        Employee employee1 = desarialize();
        System.out.println(employee1.getName());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getPhone());

    }

    private static Employee desarialize() throws IOException, ClassNotFoundException {
        Employee employee = null;
        try (FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            employee = (Employee) objectInputStream.readObject();
        }
        return  employee;
    }

    private static void serialize(Employee employee) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(employee);
        }

    }
}
