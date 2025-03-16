package com.core.javacodes.Patterns;

public class AlphabeticPatternLogic {
    public static void main(String[] args) {
        int alphabet_A = 65;
        for(int i = 0; i < 5; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print((char) alphabet_A+" ");
            }
            System.out.println();
            alphabet_A++;
        }

        int i = (byte) + (char) - (int)+ (long) - 1;
        System.out.println(i);

        int j = (int)+ (long) - 1;
        System.out.println(j);

        int k = (char)1;
        System.out.println(k);

        int l = (byte)1;
        System.out.println(l);

        /*
        *
          /"Hello"/
          /'Hello'/
          I love "java" and "programming" and "movies"
          'I love "java" and "programming" and "movies"
        *
         */

        System.out.println("/\"Hello\"/");
        System.out.println("/'Hello'/");
        System.out.println("\"/'Hello'/\"");
        System.out.println("\"Hello\"");
        System.out.println("I love \"java\" and \"programming\" and \"movies\"");
    }
}
