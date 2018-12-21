package com.tutorialspoint.examples;

public class InstanceOfTest {

    public static void main(String args[]){
        String name = "James Milner";

        boolean result = name instanceof String;
        System.out.println("It is " + result + " that " + name + " is an instance of String");
    }
}
