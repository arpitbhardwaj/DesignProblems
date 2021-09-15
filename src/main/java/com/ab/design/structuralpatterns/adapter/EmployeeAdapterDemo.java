package com.ab.design.structuralpatterns.adapter;

public class EmployeeAdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        System.out.println(employeeClient.getEmployeeList());
    }
}
