package com.core.javacodes;

public class IntegerCaching {
    public static void main(String[] args) {

        /*
        Compare two int numbers (Integer Caching)
        //-128 to 127(Range)
        //Within Range - Equal
        //Outside Range - not equal
         */
        Integer num1 = -128;
        Integer num2 = -128;

        if(num1 == num2)
        {
            System.out.println("both are equal");
        }else {
            System.out.println("both are not equal");
        }

        System.out.println(num1.equals(num2));
    }
}
