package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task2_SumWhileLoop;

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
