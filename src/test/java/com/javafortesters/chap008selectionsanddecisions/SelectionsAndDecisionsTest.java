package com.javafortesters.chap008selectionsanddecisions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionsAndDecisionsTest {

    @Test
    public void catOrCatsTernary(){
        assertEquals("cats", catOrCats(25));
    }

    private String catOrCats(Integer cat){
        String x = cat > 1 ? "cats" : "cat";

        System.out.println("Number of cats is " + cat);
        return x;
    }

    public String countryFromCode(String code){
        String countryName;

        switch(code.toLowerCase()){
            case "us":
            case "usa":
                countryName = "United States";
                break;
            case "uk":
                countryName = "United Kingdom";
                break;
            case "fr":
                countryName = "France";
                break;
            case "se":
                countryName = "Sweden";
                break;
            default:
                countryName = "Rest Of World";
        }
        return countryName;
    }

    @Test
    public void uSReturnsUnitedStates(){
        assertEquals("United States", countryFromCode("uS"));
    }
}
