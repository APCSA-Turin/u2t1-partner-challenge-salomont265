package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("ti-84");

        int x =  calc1.absoluteValue(10, 20);
    
        System.out.println(x);

        String y =  calc1.coordinatePair(10, 20);
    
        System.out.println(y);
        //test your program here
        //1. create an instance of the calculator class

        //2. call any methods of that class to test

    }
}
