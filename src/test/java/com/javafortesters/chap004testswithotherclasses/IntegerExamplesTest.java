package com.javafortesters.chap004testswithotherclasses;

import org.junit.Test;

import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void stringInteger(){
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void autoboxingTest(){
        Integer six = 6;
        assertEquals("Autoboxing 6 gives 6", 6, six.intValue());
    }

    @Test
    public void hexConversionTest(){
        Integer eleven = 11;
        Integer ten = 10;
        Integer three = 3;
        Integer twentyOne = 21;

        assertEquals("Hex conversion gives b", "b", toHexString(eleven));
        assertEquals("Hex conversion gives a", "a", toHexString(ten));
        assertEquals("Hex conversion gives 3", "3", toHexString(three));
        assertEquals("Hex conversion gives 15", "15", toHexString(twentyOne));
    }

    @Test
    public void maxAndMinIntegerTest(){
        assertEquals(Integer.MAX_VALUE, 2147483647);
        assertEquals(Integer.MIN_VALUE, -2147483648);
    }
}
