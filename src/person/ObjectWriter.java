package person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person pl = new Person("Jan", "Kowalski");

        try (
            FileOutputStream fs = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(pl);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
