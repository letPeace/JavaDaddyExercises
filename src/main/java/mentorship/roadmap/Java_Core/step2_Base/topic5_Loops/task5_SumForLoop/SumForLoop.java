package mentorship.roadmap.Java_Core.step2_Base.topic5_Loops.task5_SumForLoop;

public class SumForLoop {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("Сумма от 1 до 1000: " + sum);
    }
}
