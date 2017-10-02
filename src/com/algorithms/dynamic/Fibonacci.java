package com.algorithms.dynamic;

public class Fibonacci {

    public static void main(String[] args) {

    }

    private static int fibonacciRecursive(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static int fibonnaciMemo(int n) {

        return fibonacciMemo(n, new int[n + 1]);
    }

    private static int fibonacciMemo(int n, int[] memo) {
        if (n == 0 || n == 1) return n;

        if (memo[n] == 0) {
            memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        }

        return memo[n];
    }

    private static long fibonacciIterative(int n) {
        if (n == 0) return n;
        long a = 0, b = 1;

        for (int i = 2; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }




}
