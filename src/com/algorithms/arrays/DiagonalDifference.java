package com.algorithms.arrays;

public class DiagonalDifference {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        arr[0][0] = 11;
        arr[0][1] = 2;
        arr[0][2] = 4;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 10;
        arr[2][1] = 8;
        arr[2][2] = -12;

        System.out.println(calculateDifference(arr));


    }

    private static int calculateDifference(int[][] matrix) {
        int n = matrix.length;

        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) d1 += matrix[i][j];
                if (i == n - j - 1) d2 += matrix[i][j];
            }
        }

        return Math.abs(d1 - d2);
    }


}
