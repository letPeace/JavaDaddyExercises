package mentorship.roadmap.step_2_core.step2.methods.SquareCalculator;

public class SquareCalculator {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int num = 7;
        int result = square(num);
        System.out.println("Квадрат числа " + num + " равен " + result);
    }
}
