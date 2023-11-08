package org.example;

public class AppData {
    private String[] headers;
    private int[][] data;

    public AppData(int headersCount, int dataArraysCount, int dataArraysLength) {
        this.headers = new String[headersCount];
        this.data = new int[dataArraysCount][dataArraysLength];
    }
    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void addData(int index, int[] data) {
        this.data[index] = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }
}
