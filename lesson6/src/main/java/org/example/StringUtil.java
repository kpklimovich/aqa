package org.example;

public class StringUtil {
    public static int[] parseStringToIntArray(String line, String separator) {
       String[] stringArray = line.split(separator);
       int[] arrayInt = new int[stringArray.length];
       for (int i=0; i<stringArray.length; i++) {
           arrayInt[i] = Integer.parseInt(stringArray[i]);
       }
       return arrayInt;
    }

    public static String createStringWithSeparatorFromIntArray(int[] arrayInt, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int el : arrayInt) {
            sb.append(el).append(separator);
        }

        return sb.toString();
    }
}
