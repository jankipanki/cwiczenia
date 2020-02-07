package calculator4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę");
                a = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj doperator erytmetyczny: +, -, *, /");
                operator = scanner.nextLine();
                System.out.println("Podaj drugą liczbę");
                b = scanner.nextDouble();
                scanner.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane. Zacznij jeszcze raz");
                scanner.nextLine();
            }
        }
        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b + "=" + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.out.println("Nie udało się obliczyć wyniku wyrażenia " + a + operator + b);
        }
    }
}
