package com.tutorialspoint.examples.codeWars;

class countingSheepKata {
    public static String countingSheep(int num) {
        String sheep = "";

        for(int i = 0; i < num; i++) {
            sheep = sheep + (i + 1) + " sheep...";
        }
        return sheep;
    }
}
