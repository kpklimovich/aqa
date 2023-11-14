package org.example;

public class Main {
    public static int foo(String[][] stringArray) throws MyArraySizeException, MyArrayDataException{
        final int matrixSize = 4;
        int sum = 0;
        if (stringArray.length != matrixSize || stringArray[0].length != matrixSize) {
            throw new MyArraySizeException();
        }
        for (int i=0; i<stringArray.length; i++) {
            for (int j=0; j<stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch(NumberFormatException e) {
                    throw new MyArrayDataException(stringArray[i][j],i,j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] strArray1 = {{"1","2","3","4"},{"1","2","3","4"},{"4","s","1","2"},{"3","4","5","6"}};
        String[][] strArray2 = {{"1","2","3","4"},{"1","2","3","4"},{"4","3","1","2"},{"3","4","5"}};
        try {
            foo(strArray2);
        } catch(MyArraySizeException e) {

        } catch(MyArrayDataException e) {

        }
    }
}
