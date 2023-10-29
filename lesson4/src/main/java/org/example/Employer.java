package org.example;

public class Employer {
    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    public Employer(String FIO, String position, String email, String phoneNumber, float salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployerInformation() {
        System.out.println("Fio - " + FIO);
        System.out.println("Position - " + position);
        System.out.println("Email - " + email);
        System.out.println("Phone number - " + phoneNumber);
        System.out.println("Salary - " + salary);
        System.out.println("Age - " + age);
    }
}
