package com.core.javacodes.ArraysHashing;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_ContainsDuplicate217 {
//    https://leetcode.com/problems/contains-duplicate/description/

    public boolean containsDuplicateBruteForce(int[] nums) {

        for(int i =0; i< nums.length; i++)
        {
            for (int j = i+1 ;j< nums.length; j++)
            {
                if(nums[i] == (nums[j]))
                {
                    System.out.println("Duplicate element is : "+ nums[i]+" --> O(n^2)");
                    return true;
                }
            }
        }

        return false;
    }
    public boolean containsDuplicateHashSet(int[] nums) {

        Set<Integer> namesSet = new HashSet<>();
        int count = 0;
        for (int n : nums)
        {
            if(!namesSet.add(n))
            {
                System.out.println("Duplicate element is : '"+ n+"' at index : "+ count +" --> O(n)");
                return true;
            }
            count++;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        Leetcode_ContainsDuplicate217 ans = new Leetcode_ContainsDuplicate217();
        System.out.println(ans.containsDuplicateHashSet(nums));
    }
}
