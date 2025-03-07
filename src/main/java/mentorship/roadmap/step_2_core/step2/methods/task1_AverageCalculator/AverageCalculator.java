package mentorship.roadmap.step_2_core.step2.methods.task1_AverageCalculator;

public class AverageCalculator {

    public static double getAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return numbers.length > 0 ? sum / numbers.length : 0;
    }

    public static void main(String[] args) {
        double[] data = {3.5, 4.0, 2.5, 5.0};
        System.out.println("Среднее значение: " + getAverage(data));
    }
}
