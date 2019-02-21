package com.tutorialspoint.examples.TwelveSmallJavaPrograms;

public class EvenOrOdd {

    public static void main(String[] args) {
        int number, rem;

        number = 7;
        rem = number % 2;

        if(rem == 0) {
            System.out.println("Number is even: " + number);
        } else {
                System.out.println("Number is odd: " + number);
        }
    }
}
