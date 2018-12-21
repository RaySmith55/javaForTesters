package com.tutorialspoint.examples;

public class Test {

    public void puppyAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.puppyAge();
    }
}
