package hispital;

public class Hospital {
    private int employeesNumber = 0;
    Person[] employees = new Person[3];

    void add(Person person) {
        employees[employeesNumber] = person;
        employeesNumber++;
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + employees[i].getInfo() + "\n";
        }
        return result;
    }
}
