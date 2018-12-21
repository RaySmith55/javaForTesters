package com.tutorialspoint.examples;

public class MyClass {
    int num;
    MyClass(int i) {
        num = i;
    }

    public static class ConsDemo{
        public static void main(String args[]){
            MyClass test1 = new MyClass(15);
            MyClass test2 = new MyClass(10);

            System.out.println(test1.num + " " + test2.num);
        }
    }
}
