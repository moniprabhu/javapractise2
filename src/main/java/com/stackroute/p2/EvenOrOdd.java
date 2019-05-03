package com.stackroute.p2;

public class EvenOrOdd {
    public static boolean isEven(int number) {

        Boolean str;
        if (number % 2 == 0) {
            str = true;
        } else {
            str = false;
        }
        return str;
    }
}