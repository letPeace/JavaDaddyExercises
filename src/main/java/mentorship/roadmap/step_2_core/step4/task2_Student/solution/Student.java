package mentorship.roadmap.step_2_core.step4.task2_Student.solution;

import mentorship.roadmap.step_2_core.step4.task1_Person.solution.Person;

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
