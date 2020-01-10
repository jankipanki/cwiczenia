package wspolrzedne2;

public class PointApplication {
    public static void main(String[] args) {
        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int wartosc = 4;

        Point pl = new Point(10,30);
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
        PointController pc = new PointController();

        switch (wartosc) {
            case 0:
              pc.addX(pl);
              break;
            case 1:
                pc.addY(pl);
                break;
            case 2:
                pc.minusX(pl);
                break;
            case 3:
                pc.minusY(pl);
                break;
            default:
                System.out.println("posano błędną wartość");
        }
        System.out.println("Punkt: (" + pl.getX() + ";" + pl.getY() + ")");
    }
}
