package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String filePath = "src/main/resources/data.csv";

        AppData appData = FileUtil.read(filePath);
        FileUtil.save("src/main/resources/data1.csv", appData);
    }
}