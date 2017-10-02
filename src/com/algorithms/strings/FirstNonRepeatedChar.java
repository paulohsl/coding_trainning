package com.algorithms.strings;


import java.util.HashMap;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        String word = "happy";

        System.out.println(firstNonRepeated2(word));

    }


    public static Character firstNonRepeated(String word) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char ch : word.toCharArray()) {
            int val = charMap.get(ch);
            if (val == 0) {
                charMap.put(ch, 1);
            } else {
                charMap.put(ch, val++);
            }
        }

        for (char ch : word.toCharArray()) {
            if (charMap.get(ch) == 1) return ch;
        }

        return null;

    }


    public static String firstNonRepeated2(String str) {

        HashMap<Integer, Object> charMap = new HashMap<>();
        Object seenOnce = new Object(), seenMultiple = new Object();

        Object seen;
        int i;
        final int length = str.length();

        for (i = 0; i < length; ) {
            final int cp = str.codePointAt(i);
            i += Character.charCount(cp);
            seen = charMap.get(cp);
            if (seen == null) {
                charMap.put(cp, seenOnce);
            } else {
                if (seen == seenOnce) {
                    charMap.put(cp, seenMultiple);
                }
            }
        }

        for (i = 0; i < length; ) {
            final int cp = str.codePointAt(i);
            i += Character.charCount(cp);
            if (charMap.get(cp) == seenOnce) {
                return new String(Character.toChars(cp));
            }
        }

        return null;
    }
}
