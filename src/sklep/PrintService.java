package sklep;

public class PrintService {
    public void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessane(client);
        printPrices(originalPrice, discountPrice);
    }

    private void printWelcomeMessane(Client client) {
        String firstname = client.getFirstName();
        String lastname = client.getLastName();
        if (lastname == null && firstname == null) {
            System.out.println("Witaj nieznajomy");
        } else {
            if (firstname == null) {
                System.out.println("Dzień dobry " + lastname);
            } else {
                if (lastname == null) {
                    System.out.println("Witaj " + firstname);
                } else {
                    System.out.println("Witaj " + firstname + " " + lastname);
                }
            }
        }
    }

    private void printPrices(double originalPrice, double discountPrice) {
        System.out.println("Kwota przed rabatem " + originalPrice);
        System.out.println("Do zapłaty po rabacie " + discountPrice);
    }
}
