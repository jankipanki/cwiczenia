package sklep;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null,"Szymański",true);
        double price1 = 1100;

        Client client2 = new Client("Karol","Nowak",false);
        double price2 = 1100;


        DiscountService discountService = new DiscountService();
        PrintService printService = new PrintService();

        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        printService.printSummary(client1,price1,priceDiscount1);
        printService.printSummary(client2,price2,priceDiscount2);
    }
}
