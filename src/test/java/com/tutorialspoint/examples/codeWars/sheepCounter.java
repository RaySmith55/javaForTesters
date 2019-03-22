package com.tutorialspoint.examples.codeWars;

public class sheepCounter {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int numberOfSheep = 0;

        try {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] == true) {
                    numberOfSheep++;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Null value in Array");
        }
        return numberOfSheep;
    }
}
