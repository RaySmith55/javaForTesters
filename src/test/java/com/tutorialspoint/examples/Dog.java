package com.tutorialspoint.examples;

public class Dog {
    String breed;
    int dogAge;
    String colour;

    void barking(){
    }

    void hungry(){
    }

    void sleeping(){
    }

    public Dog(String name) {
        // this constructor has one parameter, name
        System.out.println("Passed name is: " + name);
    }

    public void setAge(int age) {
        dogAge = age;
    }

    public int getAge(){
        System.out.println("Dog's age is: " + dogAge);
        return dogAge;
    }

    public static void main(String []args) {
        Dog myDog = new Dog ("Eric");

        myDog.setAge(4);

        myDog.getAge();

        System.out.println("Variable value is: " + myDog.dogAge);
    }
}
