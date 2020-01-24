package dziedziczenie;

public class Tire extends Part {
    private double size;
    private double width;

    public Tire(int serialNumber, String producer, String model, String series, double size, double width) {
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setSeries(series);
        this.size = size;
        this.width = width;
    }

    void printInfo(){
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries() + ", " + size + ", " + width);
    }
}
