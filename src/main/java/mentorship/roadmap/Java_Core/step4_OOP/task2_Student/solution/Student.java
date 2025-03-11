package mentorship.roadmap.Java_Core.step4_OOP.task2_Student.solution;

import mentorship.roadmap.Java_Core.step4_OOP.task1_Person.solution.Person;

public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        // Вызываем метод из родительского класса для вывода имени и возраста
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
