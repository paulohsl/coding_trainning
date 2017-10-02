package com.algorithms.dynamic;

public class Summation {

    public static void main(String[] args) {

        int num = 5;

        System.out.println(summation(num));

    }

    private static int summation(int n) {

        if (n <= 0) {
            return 0;
        } else {
            return n + summation(n - 1);
        }


    }

}
