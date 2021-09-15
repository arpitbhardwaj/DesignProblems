package com.ab.design.structuralpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();

        Employee employeeDb = new EmployeeDB("1234", "Arpit", "Bhardwaj", "arpitbhardwaj@gmail.com");

        employees.add(employeeDb);
        //will not work, need an adapter to do the same
        //Employee employeeLdap = new EmployeeLdap("1432", "Bablu", "Bhardwaj", "bablubhardwaj@gmail.com");

        EmployeeLdap employeeLdap = new EmployeeLdap("1432", "Bhardwaj", "Bablu", "bablubhardwaj@gmail.com");

        employees.add(new EmployeeLdapAdapter(employeeLdap));

        return employees;
    }
}
