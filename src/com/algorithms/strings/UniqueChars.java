package com.algorithms.strings;

import java.util.HashMap;

public class UniqueChars {
    public static void main(String[] args) {

        String s = "abcdae";

        System.out.println(isUniqueChars(s));

    }


    private static boolean isUniqueChars(String str) {

        char[] s = str.toCharArray();

        HashMap<Character, Boolean> charMap = new HashMap<>();


        for (char c : s) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, true);
            } else {
                return false;
            }
        }

        return true;

    }

}
