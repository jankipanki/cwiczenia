package orchard;

public class Apple extends Fruit{
    public static final String TYPE = "jabłkowate";
    private String variety;

    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getInfo(Apple apple) {
        String info = (super.getInfo(apple) + " " + apple.variety + " odmiana");
        return info;
    }
}
