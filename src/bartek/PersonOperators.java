package bartek;

import java.util.ArrayList;
import java.util.List;

public class PersonOperators {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowaska", 22));
        people.add(new Person("Piotr", "Adamiak",15));
        people.add(new Person("Jan", "Zawadzki",17));
        people.add(new Person("Krzysztof", "Wojtyniak",16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna",28));

        System.out.println(">>> People");
        printlist(people);
        System.out.println(">>> People age+1");
        for(Person person: people){
            int currentAge= person.getAge();
            person.setAge(currentAge + 1);
        }
        printlist(people);
    }

    private static void printlist(List<Person> people){
        for (Person person: people){
            System.out.println(person);
        }
    }
}

