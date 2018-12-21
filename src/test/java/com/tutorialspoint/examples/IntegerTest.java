package com.tutorialspoint.examples;

public class IntegerTest {

    public static void main (String args[]) {
        Integer x = 5;
        x = x + 10;
        System.out.println(x);

        System.out.println(x.intValue());
        System.out.println(x.byteValue());
        System.out.println(x.equals(15));
        System.out.println(x.hashCode());
        System.out.println(x.toString());
    }
}
