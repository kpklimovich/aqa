package org.example;

import java.sql.Time;

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String info;
        private double price;
        private String workingHours; //Date and time classes?

        public Attraction(String info, double price, String workingHours) {
            this.info = info;
            this.price = price;
            this.workingHours = workingHours;
        }
    }
}
