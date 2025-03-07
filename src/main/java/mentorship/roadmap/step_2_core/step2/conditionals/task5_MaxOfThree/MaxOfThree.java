package mentorship.roadmap.step_2_core.step2.conditionals.task5_MaxOfThree;

public class MaxOfThree {

    public static void main(String[] args) {
        int a = 15, b = 22, c = 19;
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Максимальное число: " + max);
    }
}
