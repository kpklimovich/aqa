package org.example;

public class Main {
    public static int matrixGrandSum(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        final int matrixSize = 4;
        int sum = 0;
        if (!isMatrixSquare(matrix, matrixSize)) {
            throw new MyArraySizeException("Неправильный размер матрицы.");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать в тип int элемент - " + matrix[i][j]
                            + ", в позиции [" + i + "][" + j + "].");
                }
            }
        }
        return sum;
    }

    public static boolean isMatrixSquare(String[][] matrix, int size) {
        if (matrix.length != size) {
            return false;
        } else {
            for (String[] row : matrix) {
                if (row.length != size) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] strArray1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"4", "4", "1", "2"}};
        String[][] strArray2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"4", "s", "1", "2"}, {"3", "4", "5", "6"}};
        try {
            matrixGrandSum(strArray1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
