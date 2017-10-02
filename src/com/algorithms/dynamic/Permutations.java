package com.algorithms.dynamic;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        String str = "ABCD";

        Permutations pm = new Permutations();

        ArrayList<String> stringPermutations = pm.stringPermutations(str);

        System.out.println(stringPermutations);
    }

    public ArrayList<String> stringPermutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        stringPermutations("", s, result);
        return result;
    }

    private void stringPermutations(String prefix, String suffix, List<String> results) {
        if (suffix.length() == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                String first = prefix + suffix.charAt(i);
                String second = suffix.substring(0, i) + suffix.substring(i + 1, suffix.length());

                stringPermutations(first, second, results);
            }
        }
    }
}
