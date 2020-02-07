package write;

import example1.Employee;

import java.io.Serializable;

public class Company implements Serializable {
    public static final int MAX_EMPLOYESS = 1;
    private Employee[] employees = new Employee[MAX_EMPLOYESS];
    private int index = 0;

    public void add(Employee employee) {
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
