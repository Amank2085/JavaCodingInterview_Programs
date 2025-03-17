package com.core.javacodes.ArraysHashing;

import java.util.ArrayList;

public class StringWordCountCapitalizedString {

    public static int using_loop(String str)
    {
        char[] arr = str.toCharArray();
        int count =0;
        for(char ch: arr)
        {
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }

        return count;
    }

    public  static int usingArrayList(String str)
    {
        String[] words = str.split("");
        ArrayList<String> capitalWords = new ArrayList<>();

        for (String word: words)
        {
            if(word.equals(word.toUpperCase()))
            {
                capitalWords.add(word);
            }
        }

        return  capitalWords.size();
    }

    public static int usingCharAt(String str)
    {
        int count = 0;
        for (int i =0; i<str.length(); i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i)< 'Z' || str.charAt(i) >= 65 && str.charAt(i)< 90)
            {
                count++;
            }
        }

        return count;
    }
    

    public static void main(String[] args) {
        String str = "thisNaveenIsPartying";
        System.out.println(using_loop(str));
        System.out.println(usingArrayList(str));
        System.out.println(usingCharAt(str));

        //4. streams
        long count4 = str.chars().filter(e -> e>=65 && e<=90).count();
        System.out.println(count4);

        //5
        long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
        System.out.println(count5);

        //Regex

    }
}
