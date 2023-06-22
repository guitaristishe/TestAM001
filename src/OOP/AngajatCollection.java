package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class AngajatCollection {
    public static void main(String[] args) {

        // collection
        ArrayList<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat("Valera", "Pamazok", 19, 25000));
        angajati.add(new Angajat("Ghita", "Pupkin", 32, 12500));
        System.out.println(angajati);
        Scanner angajatName = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = angajatName.nextLine();
        for (Angajat variabila : angajati) {
            if (variabila.getFirstName().equals(name)) {
                System.out.println(angajati);
            }
        }

        Scanner employeeAge = new Scanner(System.in);
        System.out.println("Enter age: ");
        int actualAge = employeeAge.nextInt();
        for (Angajat targetAge : angajati) {
            if (targetAge.getAge() == actualAge) {
                System.out.println(angajati);
            }
        }

        for (Angajat data : angajati) {
            System.out.println(data.getFirstName());
            System.out.println(data.setSalary(Double.parseDouble("25369.00")));
            System.out.println(data.setAge(Integer.parseInt("25")));

            System.out.println(data.getFirstName());

            //index
            System.out.println(angajati.get(1));

            for (Angajat var : angajati) {
                angajati.sort(Comparator.comparing(Angajat::getSalary));
                System.out.println(angajati);
            }

        }
    }
}
