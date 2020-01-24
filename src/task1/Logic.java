package task1;

public class Logic {
    private final int maxStudent = 100;
    private Student[] students = new Student[maxStudent];

    public void addStudent(Student student) {
        students[Student.studentNumber] = student;
        Student.studentNumber++;
    }

    public void printStudent() {
//        if (Student.getStudentNumber() >= 2) {
        for (int i = 0; i <= Student.studentNumber; i++) {
            if (students[i] != null){
                students[i].printInfo();
            }
        }
    }
}
//}
