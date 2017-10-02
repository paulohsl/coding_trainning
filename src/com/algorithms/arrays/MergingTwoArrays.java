package com.algorithms.arrays;

import java.util.ArrayList;

/*
    Imcomplete
 */

public class MergingTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 5, 7};

        int[] arr2 = new int[]{2, 4, 6};

        System.out.println(mergeTwoArrays(arr1, arr2));
    }

    private static ArrayList<Integer> mergeTwoArrays(int[] arr1, int[] arr2) {

        int p1 = 0;
        int p2 = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                res.add(arr1[p1]);
                p1++;
            }

            if (arr1[p1] >= arr2[p2]) {
                res.add(arr2[p2]);
                p2++;
            }
        }
        return res;
    }
}
