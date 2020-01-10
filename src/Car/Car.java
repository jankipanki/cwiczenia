package Car;

public class Car {
    int year;
    String brand;
    String model;
    String color;

    Car(int y, String b, String m, String c) {
        this(y, b, m);
        this.color = c;
    }

    public Car(int year, String brand, String color) {
        this.year = year;
        this.brand = brand;
        this.color = color;
    }
}
