package mentorship.roadmap.Java_Core.step7_StreamApi.LambdaExpressions.task1_Calculator.solution;

public class CalculatorDemo {
    public static void main(String[] args) {
        // Лямбда-выражение для сложения двух чисел
        Calculator add = (a, b) -> a + b;
        int result = add.operate(5, 7);
        System.out.println("Сумма: " + result);
    }
}