package com.algorithms.strings;

public class MakingAnagrams {

    public static void main(String[] args) {

        String a = "hello";
        String b = "billion";

        System.out.println(numberNeeded(a, b));
    }

    private static int numberNeeded(String a, String b) {

        int[] charCountA = getCharCounts(a);
        int[] charCountB = getCharCounts(b);

        return getDelta(charCountA, charCountB);
    }

    private static int[] getCharCounts(String str) {

        int[] charCounts = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int code = c - 'a';
            charCounts[code]++;
        }
        return charCounts;
    }

    private static int getDelta(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return -1;

        int delta = 0;

        for (int i = 0; i < arr1.length; i++) {
            int diff = Math.abs(arr1[i] - arr2[i]);
            delta += diff;
        }
        return delta;
    }


}
