package units;

public class Units {
    public static void main(String[] args) {
        Length length = new Length();
        double length1 = length.metersToCm(300);
        System.out.println(length1);

        double length2 = length.cmToMeters(300);
        System.out.println(length2);

        int h = 387;
        Time time = new Time();
        int timemin = time.hoursToMin(h);
        int times = time.minToSek(timemin);
        int timems = time.sekToMS(times);
        System.out.println(h + " godzin, to " + timems + " ms");
    }

}
