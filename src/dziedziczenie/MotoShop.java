package dziedziczenie;

public class MotoShop {
    public static void main(String[] args) {
        Tire tire = new Tire(123, "SuperTire", "ProContact", "Witer pro", 17, 225);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(123, "SuperTire", "ProContact", "Witer pro", true);
        exhaustPart.printInfo();
    }
}
