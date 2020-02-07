package abstract_1;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a*h)/2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt, ");
        sb.append("bok A: " + a + ",");
        sb.append("bok B: " + b + ",");
        sb.append("bok C: " + c + ",");
        sb.append("bok wysokość: " + h + ",");
        sb.append("pole: " + calculateArea() + ",");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}
