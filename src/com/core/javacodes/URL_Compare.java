package com.core.javacodes;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Compare {
    public static void main(String[] args) {

        try {
            System.out.println(new URL("https://www.leetcode.com/").equals(new URL("https://172.67.6.3")));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
