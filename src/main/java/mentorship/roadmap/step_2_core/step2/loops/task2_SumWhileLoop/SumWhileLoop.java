package mentorship.roadmap.step_2_core.step2.loops.task2_SumWhileLoop;

public class SumWhileLoop {

    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
    }
}
