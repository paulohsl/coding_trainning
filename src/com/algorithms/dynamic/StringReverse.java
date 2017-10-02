package com.algorithms.dynamic;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Paulo";

        System.out.println(reverse(str));
    }


    private static String reverse(String str) {

        if ((str == null) || (str.length() <= 1))
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }


}
