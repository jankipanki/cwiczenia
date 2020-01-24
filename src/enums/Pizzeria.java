package enums;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        printPizzas();
        Pizza pizza = getPizza();

        System.out.println("Dziękujemy za zmówienie pizzy " + pizza.name());
    }

    private static void printPizzas() {
        System.out.println("Dostępna pizze:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
    }

    private static Pizza getPizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką wybierasz pizze");
        Pizza pizza = Pizza.valueOf(scanner.nextLine().toUpperCase());
        scanner.close();
        return pizza;
    }
}
