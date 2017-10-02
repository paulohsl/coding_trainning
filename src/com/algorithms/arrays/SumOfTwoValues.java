package com.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoValues {

    public static void main(String[] args) {

        int num = 22;

        int[] values = new int[]{1, 2, 4, 5, 6, 8};

        System.out.println(sumOfTwoValues(values, num));
    }

    private static boolean sumOfTwoValues(int[] values, int n) {

        Set<Integer> foundValues = new HashSet<>();

        for (int value : values) {
            int diff = n - value;

            if (foundValues.contains(diff)) {
                return true;
            }

            foundValues.add(value);
        }
        return false;
    }


}
