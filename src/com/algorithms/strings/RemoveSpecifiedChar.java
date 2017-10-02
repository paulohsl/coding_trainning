package com.algorithms.strings;

public class RemoveSpecifiedChar {

    public static void main(String[] args) {

        String name = "Abhddulaaa";
        String rm = "ha";

        System.out.println(removeChars(name, rm));


    }

    private static String removeChars(String str, String rm) {

        char[] s = str.toCharArray();
        char[] r = rm.toCharArray();


        int src, dst = 0;

        boolean[] flags = new boolean[128];

        for (src = 0; src < r.length; ++src) {
            flags[r[src]] = true;
        }

        for (src = 0; src < s.length; ++src) {
            if (!flags[s[src]]) {
                s[dst++] = s[src];
            }
        }
        return new String(s, 0, dst);

    }


}
