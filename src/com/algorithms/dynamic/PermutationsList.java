package com.algorithms.dynamic;

import java.util.ArrayList;

public class PermutationsList {

    public static void main(String[] args) {

        String perm = "AB";

        System.out.println(getPerms(perm));

    }


    private static ArrayList<String> getPerms(String str) {
        ArrayList<String> result = new ArrayList<>();
        getPerms("", str, result);
        return result;
    }

    private static void getPerms(String prefix, String suffix, ArrayList<String> result) {

        if (suffix.length() == 0) result.add(prefix);

        int len = suffix.length();

        for (int i = 0; i < len; i++) {
            String before = suffix.substring(0, i);
            String after = suffix.substring(i + 1, len);
            char c = suffix.charAt(i);

            getPerms(prefix + c, before + after, result);
        }

    }


}
