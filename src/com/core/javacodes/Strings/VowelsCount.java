package com.core.javacodes.Strings;

import com.google.common.base.CharMatcher;

import java.util.stream.Stream;

public class VowelsCount {

    public static boolean isVowel(char t)
    {
        char lower = Character.toLowerCase(t); // Convert character to lowercase
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
    public static void main(String[] args) {
        String str = "this i a vowel map";

        /*
         * input.chars() : converts the string into a stream of characters (as integer values).
         * .mapToObj(c -> (char) c) : maps the integer stream to a character stream.
         * .filter(ch -> ...) : filters out only vowels by checking if the character matches any in the set of vowels (a, e, i, o, u in both uppercase and lowercase).
         * .count() : counts the remaining elements in the stream, which are the vowels.
         */
        long vowelCount = str.chars().mapToObj(c -> (char) c)
                .filter(ch -> Stream.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').anyMatch(v -> v == ch))
                .count();

        System.out.println(vowelCount);

        int vCount = 0;
        for (int x = 0; x<str.length(); x++)
        {
            if(isVowel(str.charAt(x))){
                vCount++;
            }
        }
        System.out.println(vCount);

        //using Google Guava
        String st = "aeiou";
        int vpCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
        System.out.println(vpCount);

    }
}
