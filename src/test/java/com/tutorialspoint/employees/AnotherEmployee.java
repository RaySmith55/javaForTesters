package com.tutorialspoint.employees;

public class AnotherEmployee {

    public String name;
    private static double salary;

    public static final String DEPARTMENT = "Development";

    public AnotherEmployee(String employeeName){
        name = employeeName;
    }

    public void setSalary(double employeeSalary){
        salary = employeeSalary;
    }

    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]){
        AnotherEmployee employeeOne = new AnotherEmployee("Graham");
        employeeOne.setSalary(1000);
        employeeOne.printEmployee();

        salary = 1000;
        System.out.println(DEPARTMENT + " average salary is " + salary);
    }
}
