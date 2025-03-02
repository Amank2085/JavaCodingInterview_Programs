package com.core.javacodes.ArraysHashing;

public class PrintOneToHundred {
    public static void main(String[] args) {
        /*
        Output numbers from 1...100
        Without using any numbers in your code
         */

        int one = 'A'/'A'; //1
        String s1 = "..........";

        for (int i = one;i<=(s1.length()*s1.length());i++)
        {
            System.out.println(i);
        }

        for (int i = one; i<='d'; i+=one)
        {
            System.out.println(i);
        }
    }
}
