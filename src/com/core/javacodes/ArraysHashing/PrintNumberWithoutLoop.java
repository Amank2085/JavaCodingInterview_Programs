package com.core.javacodes.ArraysHashing;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
    /*
    print 1 to 100 without using any loop
    1. recursive function
    2. Java Streams
     */
    public static void main(String[] args) {
           printNum(20,30);
        IntStream.range(1,11).forEach(e-> System.out.println(e));
    }

    public static void printNum(int startNum, int endNum)
    {
        if(startNum<=endNum)
        {
            System.out.println(startNum);
            startNum++;
            printNum(startNum,endNum);
        }
    }
}
