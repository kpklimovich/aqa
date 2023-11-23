package org.example;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox0 = new Box<>();
        Box<Orange> orangeBox0 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Apple apple0 = new Apple();
        Orange orange0 = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        appleBox0.add(apple0);
        orangeBox0.add(orange0);
        orangeBox0.add(orange1);
        orangeBox0.add(orange2);
        System.out.println(appleBox0.getWeight());
        System.out.println(orangeBox0.getWeight());
        System.out.println(orangeBox0.compare(appleBox0));
        orangeBox0.pushToOtherBox(orangeBox1);
        System.out.println(orangeBox0.getWeight());
        System.out.println(orangeBox1.getWeight());
    }
}
