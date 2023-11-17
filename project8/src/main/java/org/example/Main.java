package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<String> getUnicWordsFromArray(String[] strArray) {
        return new ArrayList<>(Arrays.stream(strArray).distinct().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        String[] strArray = {"word1", "word2", "word3", "word4", "word4", "word3", "word1", "word3", "word2", "word4",
                "word4", "word2", "word1", "word1", "word3"};
        ArrayList<String> unicList = getUnicWordsFromArray(strArray);
        System.out.println(getUnicWordsFromArray(strArray));
        for (String el : unicList) {
            System.out.printf(el + " - %d, ", Collections.frequency(Arrays.asList(strArray), el));
        }

        Phonebook phb = new Phonebook();
        phb.add("+19556474", "LastName1");
        phb.add("+29534546", "LastName2");
        phb.add("+39556474", "LastName3");
        phb.add("+49556474", "LastName1");
        System.out.println(phb.get("LastName1"));
    }
}