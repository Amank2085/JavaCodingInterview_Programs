package com.core.javacodes.ArraysHashing;

import com.google.common.math.DoubleMath;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageofAnArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; // Example array
        double averagetrad = traditionalMethod(numbers);
        System.out.println(averagetrad);

        OptionalDouble streamAverage = streamMethod(numbers);
        System.out.println(streamAverage.getAsDouble());

        //Google guava
        double avg = DoubleMath.mean(numbers);
        System.out.println(avg);
    }

    private static OptionalDouble streamMethod(int[] numbers) {

        return Arrays.stream(numbers).average();
    }

    private static double traditionalMethod(int[] numbers) {

        int sum =0;
        for (int i: numbers)
        {
            sum += i;
        }

        double average = (double) sum/numbers.length;
        return average;
    }

}
