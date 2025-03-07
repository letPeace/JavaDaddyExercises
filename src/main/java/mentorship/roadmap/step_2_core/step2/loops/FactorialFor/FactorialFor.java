package mentorship.roadmap.step_2_core.step2.loops.FactorialFor;

public class FactorialFor {

    public static void main(String[] args) {
        int n = 15;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }
}
