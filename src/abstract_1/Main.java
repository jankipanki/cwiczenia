package abstract_1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readcomplete = false;
        while (!readcomplete) {
            try {
                printOption();
                shape = shapeCalc.createShape();
                readcomplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny");
            } finally {
                shapeCalc.clearBuffor();
            }
        }
        System.out.println(shape);
        shapeCalc.closeScanner();
    }

    private static void printOption() {
        System.out.println("Wybierz figórę, dla której chcesz obliczyć pole i obwód:");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
