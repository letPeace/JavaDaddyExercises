package mentorship.roadmap.Java_Core.step2_Base.step5loops.task3_FactorialWhile;

public class FactorialWhile {

    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Факториал числа " + n + " равен " + factorial);
    }
}
