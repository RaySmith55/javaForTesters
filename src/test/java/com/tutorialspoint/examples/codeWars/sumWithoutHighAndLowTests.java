package com.tutorialspoint.examples.codeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sumWithoutHighAndLowTests {
    @Test
    public void BasicTests() {
        assertEquals(16, sumWithoutHighAndLow.sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(2147483640, sumWithoutHighAndLow.sum(new int[] {2147483647, -2147483647, 3, 2147483637}));
        assertEquals(0, sumWithoutHighAndLow.sum(null));
    }
}
