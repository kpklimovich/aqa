package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String> contacts = new HashMap<>();

    public void add(String phoneNumber, String lastName) {
        contacts.put(phoneNumber, lastName);
    }

    public ArrayList<String> get(String lastName) {
        ArrayList<String> listOfLastNames = new ArrayList<>();
        contacts.forEach((key, value) -> {
            if (value == lastName) {
                listOfLastNames.add(key);
            }
        });
        return listOfLastNames;
    }
}
