package com.tutorialspoint.examples.codeWars;

public class sumOfNumbersAndBetween {

    public int AddNumbers(int a, int b) {
        int total = 0;

        for(int i = a; i <= b; i++) {
            total = total + i;
        }
        return total;
    }

    public int GetSum(int c, int d) {
        try {
            if (c > d) {
                return AddNumbers(d, c);
            } else if (d > c) {
                return AddNumbers(c, d);
            } else if (c == d) {
                return c;
            }
        } catch (NullPointerException e) {
            System.out.println("Null value included");
        }
        return 0;
    }
}
