package calculator3;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 186.5);
        Human eve = new Human("Ewa",167.5);

        Human.avgHeight = (adam.getHeight() + eve.getHeight())/2;

        System.out.println("Pierwsi ludzie na Ziemi:");
        System.out.println(adam.getName() + ", " + adam.getHeight() + "cm wzrostu");
        System.out.println(eve.getName() + ", " + eve.getHeight() + "cm wzrostu");

        System.out.println("Sredni wzrost: " + Human.avgHeight);
    }
}
