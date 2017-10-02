package com.algorithms.strings;

public class ReverseWordInPlace {

    public static void main(String[] args) {

        String name = "in search of algorithmic elegance";

        char[] s = name.toCharArray();

        int start, end = 0, length = s.length;

        reverse(s, 0, s.length - 1);

        while (end < length) {
            if (s[end] != ' ') {
                start = end;
                while (end < length && s[end] != ' ')
                    end++;

                end--;
                reverse(s, start, end);
            }

            end++;
        }

        System.out.println(new String(s));
    }


    private static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }


}
