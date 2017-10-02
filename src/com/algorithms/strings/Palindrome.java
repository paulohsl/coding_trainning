package com.algorithms.strings;

public class Palindrome {
    public static void main(String[] args) {

        String str = "repaper";

        boolean result = isPalindrome(str);

        System.out.println(result);

    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
