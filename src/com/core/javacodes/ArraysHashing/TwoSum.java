package com.core.javacodes.ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {

    /*
    https://leetcode.com/problems/two-sum/description/

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     You can return the answer in any order.

     Example 1:

     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    // Brute Force
    public int [] twoSum(int[] nums,int target)
    {
        for (int i =0; i < nums.length; i++)
        {
            for(int j = i + 1; j< nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }

//    using HashMap Two pass
    public int [] twoSumMapTwoPass(int[] nums,int target)
    {
        //Create a HashMap to store numbers and their indices
        HashMap<Integer,Integer> map = new HashMap<>();

        // Key --> value / value -- index
        // Iterate through the array
        for (int i =0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }

        for (int i =0; i < nums.length; i++)
        {
            int findMe = target - nums[i];
            if(map.containsKey(findMe) && map.get(findMe) != i)
                return new int[]{i, map.get(findMe)};
        }
        return new int[] {};
    }

    public int [] twoSumMapSinglePass(int[] nums,int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i++)
        {
            // Calculate the findMe of the current number
            int findMe = target - nums[i];

            // Check if the findMe is already in the Map
            if(map.containsKey(findMe) && map.get(findMe) != i) {
                //If found return the indices of the findMe and the current number
                return new int[]{i, map.get(findMe)};
            }

            //Otherwise, add the current number and its index to the map
            map.put(nums[i],i);
        }

        return new int[] {};
    }

//    -using streams
    public static int[] twoSumStream(int[] nums, int target)
    {
        Map<Integer, Integer> numMap = new HashMap<>();
        return IntStream.range(0, nums.length) .filter(
                i -> { int complement = target - nums[i];
                    if (numMap.containsKey(complement))
                    {
                        return true;
                    }
                    else {
                        numMap.put(nums[i], i);
                        return false;
                    }}) .mapToObj(i -> new int[]{numMap.get(target - nums[i]), i}) .findFirst() .orElse(null);
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSum sum = new TwoSum();
        int [] result = sum.twoSum(nums,target);
        int [] result1 = sum.twoSumMapTwoPass(nums, target);
        int [] result2 = sum.twoSumMapSinglePass(nums,target);
        System.out.println("Brute Force O(n^2) : "+Arrays.toString(result));
        System.out.println("Map Two Pass O(n) : "+Arrays.toString(result1));
        System.out.println("Map Single Pass O(n) : "+Arrays.toString(result2));
    }
}
