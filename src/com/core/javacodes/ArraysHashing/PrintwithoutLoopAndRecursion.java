package com.core.javacodes.ArraysHashing;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintwithoutLoopAndRecursion {

    public static void main(String[] args) {

        //1. Using Instream
        //IntStream.rangeClosed(1, 100).forEach(System.out::println);

        String result = IntStream.rangeClosed(1, 100)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
        System.out.println("["+result+"]");

        //2. Arrays fill
        Object num[] = new Object[100];

        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });

        System.out.println(Arrays.toString(num));
    }
}
