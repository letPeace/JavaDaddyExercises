package mentorship.roadmap.step_2_core.step2.forEachLoops.ForEachSum;

public class ForEachSum {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов: " + sum);
    }
}
