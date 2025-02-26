package com.core.javacodes.Arrays_Hashing;

import java.util.Arrays;

public class ValidAnagram242 {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    Example 1:
       Input: s = "anagram", t = "nagaram"
       Output: true

    Example 2:
        Input: s = "rat", t = "car"
        Output: false
     */

//    https://docs.google.com/spreadsheets/d/1hzP8j7matoUiJ15N-RhsL5Dmig8_E3aP/edit?gid=1377915986#gid=1377915986

    public boolean isAnagram(String s, String t) {

        // If the length are different, they can't be anagrams
        if(s.length() != t.length()){
            return false;
        }

        //create an array to count character frequencies
        int[] charCounts = new int[26];

        //Increment count for each character in s and decrement for each in t
        for (int i =0; i<s.length(); i++)
        {
            // ascii value of 'a' = 97
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //check if all counts are zero
        for (int count:charCounts)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String s = "rat";
       String t = "tar";
       ValidAnagram242 ans = new ValidAnagram242();
        System.out.println(ans.isAnagram(s,t));

    }
}
