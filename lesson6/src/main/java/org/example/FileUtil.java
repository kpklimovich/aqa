package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {
    private final static String delimiter = ";";

    public static void save(String filePath, AppData appData) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        if (appData.getHeaders().length != 0) {
            writer.write(String.join(delimiter, appData.getHeaders()) + "\r\n");
        }

        int data[][] = appData.getData();

        for (int[] dataArray : data) {
            writer.write(StringUtil.createStringWithDelimiterFromIntArray(dataArray, delimiter) + "\r\n");
        }
        writer.close();
    }

    public static AppData read(String filePath) throws IOException {
        List<String> fileData = Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);
        String[] headers = fileData.get(0).split(delimiter);
        AppData appData = new AppData(headers.length, headers.length, fileData.size()-1);
        appData.setHeaders(headers);

        for (int i=1; i<fileData.size(); i++) {
            appData.addData(i-1, StringUtil.parseStringToIntArray(fileData.get(i), delimiter));
        }

        return appData;
    }
}
