package Car;

public class NumberPrinter {
    void printNumver(int a) {
        System.out.println(a);
    }

    void printNumver(int a, int b) {
        printNumver(a);
        System.out.println(b);
    }

    void printNumver(int a, int b, int c) {
        printNumver(a, b);
        System.out.println(c);
    }
}
