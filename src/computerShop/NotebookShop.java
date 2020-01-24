package computerShop;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        dataStore.add(new Computer("Asus", "12345"));
        dataStore.add(new Computer("Apple", "5"));
        dataStore.add(new Computer("Asus", "12345"));
        dataStore.add(new Computer("Apple", "6"));
        dataStore.add(new Computer("HP", "984654"));
        dataStore.add(new Computer("Asus", "12345"));

        Computer computerToFind = new Computer("Asus", "12345");
        int computersFound = dataStore.checkAvailability(computerToFind);
        System.out.println("Liczba komputerów" + computerToFind + " jest " + computersFound);

        System.out.println("Wszystkie dostęne komputery");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
