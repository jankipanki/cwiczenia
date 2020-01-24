package task1;

import java.util.Scanner;

public class University {
    private static final int EXIT = 0;
    public static void main(String[] args) {
        Logic logic = new Logic();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Podaj imię studenta");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko studenta");
            String lastName = sc.nextLine();
            System.out.println("Podaj indeks studenta");
            String indexNumber = sc.nextLine();
            Student student = new Student(firstName, lastName, indexNumber);
            logic.addStudent(student);
            logic.printStudent();
            System.out.println("Koniec programu? Wprowadź " + EXIT);
        } while (sc.nextInt() != EXIT);
        sc.close();
    }
}
