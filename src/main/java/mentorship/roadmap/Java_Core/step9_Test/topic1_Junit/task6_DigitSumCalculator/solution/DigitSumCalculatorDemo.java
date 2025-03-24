package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator.solution;

public class DigitSumCalculatorDemo {
    public static int sumDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
