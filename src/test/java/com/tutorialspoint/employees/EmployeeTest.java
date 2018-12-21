package com.tutorialspoint.employees;

import java.io.*;

public class EmployeeTest {

    public static void main(String args[]) {

        Employee empOne = new Employee("Henry Tudor");
        Employee empTwo = new Employee("Barry Scott");

        empOne.empAge(18);
        empOne.empDesignation("King");
        empOne.empSalary(500000);
        empOne.printEmployee();

        empTwo.empAge(45);
        empTwo.empDesignation("TV Salesperson");
        empTwo.empSalary(8);
        empTwo.printEmployee();
    }
}
