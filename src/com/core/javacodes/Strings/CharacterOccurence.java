package com.core.javacodes.Strings;

import java.util.HashMap;

public class CharacterOccurence {

    /*
    * count occurences of a character in string
     */

    public static HashMap<Character,Integer> characterCount(String str)
    {
        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<>();
        str = str.trim();
        char [] strToArray= str.toCharArray();

        for (char ch : strToArray)
        {
            if(characterIntegerHashMap.containsKey(ch))
            {
                characterIntegerHashMap.put(ch,characterIntegerHashMap.get(ch)+1);
            }
            else{
                characterIntegerHashMap.put(ch,1);
            }
        }

        return characterIntegerHashMap;
    }

    public static int charCountLoop(String str,char ch)
    {
        char [] strToArray= str.toCharArray();
        int count =0;
        for (char ch_loop: strToArray)
        {
            if (ch_loop == ch)
            {
                count++;
            }
        }
//        System.out.println(ch + " : "+count);
        return count;
    }

    public  static long getCharCount_Streams(String str, char c)
    {
        return str.chars()
                .filter(e -> (char)e == c)
                .count();
    }
    public static void main(String[] args) {
         String str = "I love coding and testing";
         int occurence = characterCount(str).get('d');
        System.out.println(occurence);
        int occurence1 = charCountLoop(str,'d');
        System.out.println(occurence1);


        System.out.println(getCharCount_Streams(str,'d'));
    }
}
