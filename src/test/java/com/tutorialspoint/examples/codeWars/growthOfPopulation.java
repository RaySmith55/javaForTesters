package com.tutorialspoint.examples.codeWars;

public class growthOfPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;

        for (years = 1; p0 < p; years++) {
            p0 = (int) (p0 * (1 + (percent / 100)));
            p0 = p0 + aug;
            if (p0 >= p){
                break;
            }
        }
        return years;
    }
}
