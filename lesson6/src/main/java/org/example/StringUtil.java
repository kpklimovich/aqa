package org.example;

public class StringUtil {
    public static int[] parseStringToIntArray(String line, String delimiter) {
       String[] stringArray = line.split(delimiter);
       int[] arrayInt = new int[stringArray.length];
       for (int i=0; i<stringArray.length; i++) {
           arrayInt[i] = Integer.parseInt(stringArray[i]);
       }
       return arrayInt;
    }

    public static String createStringWithDelimiterFromIntArray(int[] arrayInt, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int el : arrayInt) {
            sb.append(el).append(delimiter);
        }

        return sb.toString();
    }
}
