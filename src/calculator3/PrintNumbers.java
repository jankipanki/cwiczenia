package calculator3;

import sklep.PrintService;

import java.util.Scanner;

public class PrintNumbers {
    private static final int EXIT = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Pierwsza liczba");
            int start = input.nextInt();
            input.nextLine();
            System.out.println("Druga liczba");
            int end = input.nextInt();
            input.nextLine();
            printNumbers(start, end);
            System.out.println("Koniec programu? Wprowadź " + EXIT);
        } while (input.nextInt() != EXIT);
        input.close();
    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
