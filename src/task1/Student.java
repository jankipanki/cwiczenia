package task1;

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    public static int studentNumber = 0;

    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void printInfo() {
        String info = firstName + ", " + lastName + " , " + indexNumber +  ".";
        System.out.println(info);
    }
}
