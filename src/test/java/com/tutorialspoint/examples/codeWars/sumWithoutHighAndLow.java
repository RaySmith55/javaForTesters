package com.tutorialspoint.examples.codeWars;

import java.util.stream.IntStream;

public class sumWithoutHighAndLow {

    public static int sum(int[] numbers) {
        int biggestNumber = -2147483647;
        int smallestNumber = 2147483647;

        try {
            if (numbers.length < 2) {
                return 0;
            }

            for(int num : numbers) {
                if (num <= smallestNumber) {
                    smallestNumber = num;
                }
                if (num >= biggestNumber) {
                    biggestNumber = num;
                }
            }

            int sum = IntStream.of(numbers).sum();
            sum = sum - (biggestNumber + smallestNumber);

            return sum;

        } catch(NullPointerException e) {
            return 0;
        }
    }
}
