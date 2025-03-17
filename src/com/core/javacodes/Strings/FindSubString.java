package com.core.javacodes.Strings;

public class FindSubString {

    public static  boolean isSubString(String s1, String s2)
    {
        return s1.matches("(.*)"+s2+"(.*)");
    }

    public  static boolean isSubString1(String str, String sub)
    {
        return str.contains(sub);
    }

    public static  boolean isSubString2(String str, String sub)
    {
        return  str.indexOf(sub) != -1;
    }

    public static void main(String[] args) {
        System.out.println(isSubString("Selenium testing","testing"));
        System.out.println(isSubString1("Selenium testing","testing"));
        System.out.println(isSubString2("Selenium testing","testing"));
    }
}
