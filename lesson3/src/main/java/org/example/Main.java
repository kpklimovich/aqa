package org.example;

import java.util.Arrays;

public class Main {
    public static boolean betweenNumbers(int a, int b) {
        return ((a + b) > 10) && ((a + b) <= 20);
    }

    public static void positiveOrNegative(int number) {
        String result = (number >= 0) ? "positive" : "negative";
        System.out.println(result);
    }

    public static boolean revertPositiveOrNegative(int number) {
        return !(number >= 0);
    }

    public static void printStrCntTimes(String str, int cntTimes) {
        for (int i = 0; i < cntTimes; i++) {
            System.out.println(str);
        }
    }

    public static boolean doesLeapYear(int year) {
        if ((year % 100 == 0) && (year % 400) != 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void replaceNumbersInArr() {
        int[] arr = {0, 1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillMatrix() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - (i+1)] = 1;
        }
        for( int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] createAndFillArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void main(String[] args) {
        System.out.println(betweenNumbers(11,9));
        positiveOrNegative(0);
        System.out.println(revertPositiveOrNegative(-3));
        printStrCntTimes("test",3);
        System.out.println(doesLeapYear(400));
        replaceNumbersInArr();
        fillArray();
        changeArray();
        fillMatrix();
        System.out.println(Arrays.toString(createAndFillArray(3,4)));
    }
}
