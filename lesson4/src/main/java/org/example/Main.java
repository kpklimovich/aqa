package org.example;

public class Main {
    public static void main(String[] args) {
        final int borderAge = 40;
        Employer[] employers = new Employer[5];
        employers[0] = new Employer("FirstName0 LastName0 Surname0", "worker", "test0@mail.com",
                "+785234120", 233.23,29);
        employers[1] = new Employer("FirstName1 LastName1 Surname1", "worker", "test1@mail.com",
                "+785234121", 233.23,32);
        employers[2] = new Employer("FirstName2 LastName2 Surname2", "worker", "test2@mail.com",
                "+785234122", 233.23,45);
        employers[3] = new Employer("FirstName3 LastName3 Surname3", "worker", "test3@mail.com",
                "+785234123", 233.23,20);
        employers[4] = new Employer("FirstName4 LastName4 Surname4", "worker", "test4@mail.com",
                "+785234124", 233.23,41);

        for (Employer empl : employers) {
            if (empl.getAge() > borderAge) {
                empl.getEmployerInformation();
                System.out.println();
            }
        }
    }
}
