package com.algorithms.strings;

public class Anagrams {

    public static void main(String[] args) {

        String str1 = "Carol";
        String str2 = "loraC";

        System.out.println(isAnagram2(str1, str2));

    }

    private static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        char[] chars = str1.toCharArray();

        for (char c : chars) {
            int index = str2.indexOf(c);

            String part1 = str2.substring(0, index);
            String part2 = str2.substring(index + 1, str2.length());

            if (index != -1) {
                str2 = part1 + part2;

            } else {
                return false;
            }
        }
        return str2.isEmpty();
    }

    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] alphabet = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            alphabet[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            alphabet[s1.charAt(i)]--;
            if (alphabet[i] != 0) {
                return false;
            }
        }


        return true;
    }


}
