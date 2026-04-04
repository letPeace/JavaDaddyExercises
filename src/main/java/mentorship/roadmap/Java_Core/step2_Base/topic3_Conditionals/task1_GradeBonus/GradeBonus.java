package java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task1_GradeBonus;

import java.util.Scanner;

public class GradeBonus {
    public GradeBonus() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        switch (grade) {
            case 3:
                System.out.println("Bonus +50!");
                break;
            case 4:
                System.out.println("Bonus +75!");
                break;
            case 5:
                System.out.println("Bonus +100!");
                break;
            default:
                System.out.println("Bonus +0!");
        }

    }
}
