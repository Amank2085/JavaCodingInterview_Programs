package com.core.javacodes;

import java.util.*;

public class Leetcode1748_SumOfUniqueElements {

    public static List<Integer> missingNumbers(int[] nums) {
        // Find the maximum value in the array
        int max = Arrays.stream(nums).max().orElse(0);

        // Create a set of all numbers in the range [0, max]
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i <= max; i++) {
            allNumbers.add(i);
        }

        // Remove all numbers present in the array
        for (int num : nums) {
            allNumbers.remove(num);
        }

        // Convert the set to a list and return
        return new ArrayList<>(allNumbers);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of all numbers from 0 to n
        int arraySum = 0;

        // Calculate the sum of elements in the array
        for (int num : nums) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int [] nums = {0,1};
        System.out.println(missingNumber(nums));
        int[] numa1 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(numa1));
        int[] nums3 = {9,4,2,7,0,1};
        System.out.println(missingNumbers(nums3));
    }
}
