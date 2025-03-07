package mentorship.roadmap.step_2_core.step5.exceptions.task1_ArithmeticException.solution;

public class DivisionDemo {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0; // можно изменить на ненулевое значение для проверки нормальной работы

        try {
            int result = dividend / divisor;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль недопустимо.");
        }
    }
}
