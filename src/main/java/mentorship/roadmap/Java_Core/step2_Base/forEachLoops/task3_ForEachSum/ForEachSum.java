package mentorship.roadmap.Java_Core.step2_Base.forEachLoops.task3_ForEachSum;

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
