package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> content;

    public Box() {
        this.content = new ArrayList<>();
    }

    public void add(T fruit) {
        content.add(fruit);
    }

    public double getWeight() {
        return content.isEmpty() ? 0.0 : content.size() * content.get(0).getWeight();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pushToOtherBox(Box box) {
        content.forEach(box::add);
        content.clear();
    }
}
