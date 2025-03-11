package mentorship.roadmap.Java_Core.step5_AdvancedBase.exceptions.task5_Finally.solution;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println("Ресурс открыт.");
        try {
            int result = 10 / 0; // вызовет ArithmeticException
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        } finally {
            System.out.println("Ресурс закрыт.");
        }
    }
}
