package person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person pl = null;

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            pl = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nie udało się odzyskać pliku");
            e.printStackTrace();
        }

        if (pl != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(pl.getFirstName() + " " + pl.getLastName());
        }
    }
}
