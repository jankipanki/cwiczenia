package calculator2;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);

        double a = inout.nextDouble();
        inout.nextLine();
        String operator = inout.nextLine();
        double b = inout.nextDouble();

        Calcutor2 calcutor2 = new Calcutor2();

        double result = calcutor2.calculate(a, b, operator);
        System.out.println(a + operator + b + " = " + result);

        inout.close();
        }

    }