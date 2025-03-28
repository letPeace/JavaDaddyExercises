package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task5_SquareCalculator;

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
