package task2;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        int next = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while ((next = scanner.nextInt()) <= 100) {
            sum += next;
        }
        System.out.println("Suma wynosi " + sum);
        int mod = sum % 2;

        if (mod == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
