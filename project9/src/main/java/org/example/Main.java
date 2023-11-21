package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(1);
        intList.add(9);
        intList.add(3);
        intList.add(4);
        System.out.println(intList.stream().filter(e->(e % 2 == 0)).count());

        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Highload");
        stringsList.add("High");
        stringsList.add("Load");
        stringsList.add("Highload");
        System.out.println(stringsList.stream().filter(str->str.equals("High")).count());

        int result;
        String element;
        if (stringsList.isEmpty()) {
            result = 0;
        } else {
            element = stringsList.stream().findFirst().toString();
        }

        if (stringsList.isEmpty()) {
            result = 0;
        } else {
            element = stringsList.get(stringsList.size()-1);
        }

        ArrayList<String> stringsList2 = new ArrayList<>();
        stringsList2.add("f10");
        stringsList2.add("f15");
        stringsList2.add("f2");
        stringsList2.add("f4");
        stringsList2.add("f4");
        System.out.println(Arrays.toString(stringsList2.stream().sorted().toArray()));

        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        System.out.println(students.stream().filter(st -> st.getGender() == Gender.MAN).mapToInt(Student::getAge).average());
        students.stream().filter(st -> st.getAge() >= 18 && st.getAge() <= 27 && st.getGender() == Gender.MAN).
                forEach(st -> System.out.println(st.getName()));

        Scanner sc = new Scanner(System.in);
        Collection<String> userInputColl = new ArrayList<>();
        while(true) {
            String userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            userInputColl.add(userInput);
        }
        userInputColl.stream().filter(s -> s.charAt(0) == 'f').forEach(s -> System.out.println(s));
    }
}
