package com.algorithms.arrays;

import java.util.ArrayList;

public class CommonElementsInSortedArray {

    public static void main(String[] args) {

        int[] a = new int[]{1,3,4,6,7,9};
        int[] b = new int[]{1,2,4,5,9,10};

        System.out.println(commonElements(a,b));

    }


    private static ArrayList<Integer> commonElements(int[] firstArr, int[] secondArr) {
        ArrayList<Integer> result = new ArrayList<>();
        int pointerA = 0, pointerB = 0;

        while (pointerA < firstArr.length && pointerB < secondArr.length) {
            if (firstArr[pointerA] == secondArr[pointerB]) {
                result.add(firstArr[pointerA]);
                pointerA++;
                pointerB++;
            } else if (firstArr[pointerA] > secondArr[pointerB]) {
                pointerB++;
            } else {
                pointerA++;
            }
        }
        return result;
    }


}
