package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class sumOfNumbersAndBetweenTests {

    sumOfNumbersAndBetween s = new sumOfNumbersAndBetween();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(360, s.GetSum(15, 30));
        assertEquals(-33, s.GetSum(-10, -12));
    }
}
