package units;

public class Length {
    double metersToCm(double meters) {
        return meters*100;
    }

    double metersToMm(double meters) {
        return meters*1000;
    }

    double cmToMeters(double meters) {
        return meters/100;
    }

    double MmToMeters(double meters) {
        return meters/1000;
    }
}
