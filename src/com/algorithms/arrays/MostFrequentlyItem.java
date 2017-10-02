package com.algorithms.arrays;

import java.util.HashMap;

public class MostFrequentlyItem {

    public static void main(String[] args) {
        int[] intArr = new int[]{3, 3, 1, 3, 2, 1,5,4,1,12,1};


        System.out.println(mostFrequent(intArr));

    }

    private static Integer mostFrequent(int[] arr) {
        int maxItem = 0, maxCount = 0;

        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int item : arr) {
            if (!intMap.containsKey(item)) {
                intMap.put(item, 1);
            } else {
                int value = intMap.get(item);
                value++;
                intMap.put(item, value);
                if (value > maxCount) {
                    maxCount = value;
                    maxItem = item;
                }
            }
        }


        return maxItem;
    }


}
