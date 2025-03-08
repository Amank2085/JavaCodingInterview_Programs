package com.core.javacodes;

public class NotANumber_NAN {
    /*
     What is NaN - Not A Number?
     How is NaN defined in different languages?
     Java, C, C++, Ruby,Python, JavaScript
     */
    public static void main(String[] args) {
        // System.out.println(2/0); --> ArthimeticException
        // System.out.println(2.0/0); --> Infinity
        // System.out.println(12.33f/0); --> Infinity
        // System.out.println(10/0.0); --> Infinity
        // System.out.println(19.9999d/0); --> Infinity

        //NaN
        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);

        //We cannot compare two undefined numbers (NAN)

        /*
        Long Numbers (without and with L)
         */
        long longNumberWithoutL = 1000*60*60*24*365;
        long longNumberWithL = 1000*60*60*24*365L;

        System.out.println(longNumberWithoutL);
        System.out.println(longNumberWithL);
        System.out.println(longNumberWithL == longNumberWithoutL);

        // 31536000000 --> 36 bits
        // 11101010111101100010010110000000000

        // 1471228928 --> 32 bits
        // 1010111101100010010110000000000

        // first 4 most significant bits from 36 bits
        // 1110 --> removed by Java

        /*
          What is the value of double MIN_VALUE?
          Which one is bigger --> Double MIN_VALUE or 0.0d?
          Which one is bigger --> Double MIN_VALUE or NEGATIVE_INFINITY?
         */
        System.out.println(Double.MIN_VALUE);  //is a +ve number

        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.min(Double.MIN_VALUE,0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE,0));
        System.out.println(Math.min(Float.MIN_VALUE, 0.0f));


    }
}
