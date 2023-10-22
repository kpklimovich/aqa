package org.example;

import java.util.Arrays;

public class Main {

    //task1
    public static boolean betweenNumbers(int a, int b) {
        return ((a + b) > 10) && ((a + b) <= 20);
    }

    //task2
    public static void positiveOrNegative(int number) {
        String result = (number >= 0) ? "positive" : "negative";
        System.out.println(result);
    }

    //task3
    public static boolean doesPositiveOrNegative(int number) {
        return (number >= 0);
    }

    //task4
    public static void printStrCntTimes(String str, int cntTimes) {
        for (int i = 0; i < cntTimes; i++) {
            System.out.println(str);
        }
    }

    //task5
    public static boolean doesLeapYear(int year) {
        if ((year % 100 == 0) && (year % 400) != 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //task6
    public static void replaceNumbersInArr() {
        int[] arr = {0, 1, 0, 1, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    //task7
    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    //task8
    public static void chngeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    //task9
    public static void fillMatrix() {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i] = 1;
        }
    }

    //taks10
    public static int[] createAndFillArray(int len, int inintilaValue) {
        int[] array = new int[len];
        Arrays.fill(array, inintilaValue);
        return array;
    }

    public static void main(String[] args) {
    }
}
