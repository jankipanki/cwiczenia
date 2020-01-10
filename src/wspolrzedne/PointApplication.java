package wspolrzedne;

public class PointApplication {
    public static void main(String[] args) {
        Point pl = new Point(10, 20);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
        pc.addX(pl);
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
        pc.addY(pl);
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
        pc.minusX(pl);
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
        pc.minusY(pl);
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
    }
}
