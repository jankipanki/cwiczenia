package javastart;

public class Bank {
    public static void main(String[] args) {
        //pierwsza osoba
        Person person1 = new Person();
        person1.firstName = "Jank";
        person1.lastName = "Kowalski";
        person1.pesel = "98091276857";
        //tworzymy adres
        Address address1 = new Address();
        address1.street = "Smolińskiego";
        address1.city = "Warszawa;";
        //taki sam adres zamieszkania i zameldowania
        person1.livingAddress = address1;
        person1.aregistiredAddress = address1;
        //pierwsze konto bankowe
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        //druga osoba
        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "84616548468462";
        //tworzymy adres
        person2.aregistiredAddress = new Address();
        person2.aregistiredAddress.street = "Sochaczewska";
        //taki sam adres zamieszkania i zameldowania
        person2.livingAddress = address1;
        //drugie konto bankowe
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("mieszka w miejscowości " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("mieszka w miejscowości " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą " + account2.balance);
    }
}