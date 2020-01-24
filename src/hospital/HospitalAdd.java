package hospital;

import java.util.Scanner;

public class HospitalAdd {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;

        Scanner sc = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatient:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("Nieznane polecenie");
            }
        }
        sc.close();
    }
}
