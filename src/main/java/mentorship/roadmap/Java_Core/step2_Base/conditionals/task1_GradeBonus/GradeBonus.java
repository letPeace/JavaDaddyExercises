package mentorship.roadmap.Java_Core.step2_Base.conditionals.task1_GradeBonus;

public class GradeBonus {

    public static void main(String[] args) {
        int grade = 4; // пример оценки
        int bonus;

        if (grade == 5) {
            bonus = 100;
        } else if (grade == 4) {
            bonus = 75;
        } else if (grade == 3) {
            bonus = 50;
        } else {
            bonus = 0;
        }

        System.out.println("Бонус за оценку " + grade + " равен " + bonus);
    }
}
