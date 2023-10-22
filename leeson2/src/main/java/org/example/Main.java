package org.example;

public class Main {

    public static void printThreeWords() {
        System.out.println("Orange\n\rBanana\n\rApple\n\r");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -11;
        String negativeSumWord = "Сумма отрицательная";
        String positiveSumWord = "Сумма положительная";

        if ((a + b) >= 0) {
            System.out.println(positiveSumWord);
        } else {
            System.out.println(negativeSumWord);
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 7;

        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
