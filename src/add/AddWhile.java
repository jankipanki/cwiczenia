package add;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
        int numbers = scanner.nextInt();

        int sum = 0;
        while (numbers-- > 0) {
            System.out.println("Podaj kolejną liczbę");
            sum += scanner.nextInt();
        }
        System.out.println("Suma " + sum);

    }
}
