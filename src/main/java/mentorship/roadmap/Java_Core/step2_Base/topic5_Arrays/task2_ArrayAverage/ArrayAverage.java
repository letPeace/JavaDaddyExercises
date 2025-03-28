package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task2_ArrayAverage;

public class ArrayAverage {

    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Среднее значение: " + average);
    }
}
