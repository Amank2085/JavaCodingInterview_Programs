package com.core.javacodes.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {
    public static void main(String[] args) {
        String str = "testing";
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(str));

        System.out.println(str.split("").length);

        int l = new StringBuilder(str).length();
        System.out.println(l);

        int count = 0;
        for(char c : str.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}
