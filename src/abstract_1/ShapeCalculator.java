package abstract_1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    public Rectangle readRectangleData() {
        System.out.println("Podaj informację o prostokącie");
        System.out.println("Podaj długość boku A");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku B");
        double b = sc.nextDouble();
        sc.nextLine();

        return new Rectangle(a, b);
    }

    public Circle readCircleData() {
        System.out.println("Podaj informację o kole");
        System.out.println("Podaj długość promienia");
        double r = sc.nextDouble();
        sc.nextLine();

        return new Circle(r);
    }

    public Triangle readTriangleData() {
        System.out.println("Podaj informację o trójkącie");
        System.out.println("Podaj długość boku A");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku B");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość boku C");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj wysokość trójkąta (h)");
        double h = sc.nextDouble();
        sc.nextLine();

        return new Triangle(a, b, c, h);
    }

    /*public Shape createShape() {
        int shapeType = sc.nextInt();
        sc.nextLine();

        switch (shapeType) {
            case Shape.RACTANGLE:
                return readRactangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                System.out.println("Nie ma takiego argumentu");
        }
    }*/
    public Shape createShape() {
        int shapeType = sc.nextInt();
        sc.nextLine();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffor() {
        sc.nextLine();
    }
}