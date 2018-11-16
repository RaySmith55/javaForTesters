package com.javafortesters.chap009arraysandforloops;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysAndForLoops {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    int[] integers = new int[10];
    int []moreints = new int[10];
    int evenMore[] = new int[10];

    String strings[] = new String[10];

    int[] ints1to10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] zeroLength = {};
    int[] moreZeroLength = new int[0];

    int[] unitializedArray;
    // unitializedArray = new int[10];
    // unitializedArray = new int[] {100, 200, 300};

    @Test
    public void testForUsers(){
        User[] users = new User[3];

        assertEquals(3, users.length);

        for(User user : users) {
            System.out.println(user);
        }

        // users[0].setPassword("terry");
        // assertEquals("terry", users[0].getPassword());
    }

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Test
    public void workdaysTest() {
        String days = "";

        for (String workday : workdays) {
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday", days);
    }

    @Test
    public void workdaysForLoop(){
        String days = "";

        for(int i=0; i<5; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void workdaysWithNumber(){
        String days = "";

        for (int i=0; i<5; i++){
            days = days + "|" + i + "-" + workdays[i];
        }
        System.out.println(days);
        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

//    @Test
//    public void testFor100Users(){
//        User[] users = {};
//
//        for (int i=0; i<100; i++){
//
//        }
//    }
}
