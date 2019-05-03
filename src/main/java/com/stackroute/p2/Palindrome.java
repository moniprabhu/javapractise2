package com.stackroute.p2;

import java.util.*;
public class Palindrome {
    public static String  findPalindrome(int n)
    {
        int temp, reverse = 0,number;
        String result;
        temp = n;
        while(n > 0)
        {
            number = n % 10;
            reverse = reverse * 10 + number;
            n = n / 10;
        }

        if(reverse == temp)
        {
            result="Given number is Palindrome";
        }
        else
        {
            result="Given number is Not Palindrome";
        }
        return result;
    }
}









