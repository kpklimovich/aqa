package org.example;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String element, int row, int col) {
        System.out.printf("Невозможно преобразовать в тип int элемент - %s, в позиции [%d][%d]", element, row, col);
    }
}
