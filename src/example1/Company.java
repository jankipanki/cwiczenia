package example1;

public class Company {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("Mariusz", "Andrzejewski", 4000);
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);

        int employeeIndex = 2;
        System.out.println(employees[employeeIndex - 1].getFirstName()+ " " + employees[employeeIndex - 1].getLastName()+": " + employees[employeeIndex-1].getSalary() + " zł");
    }
}
