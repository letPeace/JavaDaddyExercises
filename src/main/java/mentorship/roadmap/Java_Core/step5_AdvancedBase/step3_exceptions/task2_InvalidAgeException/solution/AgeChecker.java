package mentorship.roadmap.Java_Core.step5_AdvancedBase.step3_exceptions.task2_InvalidAgeException.solution;

public class AgeChecker {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст: " + age);
        }
    }

    public static void main(String[] args) {
        int age = -5; // пример некорректного возраста

        try {
            checkAge(age);
            System.out.println("Возраст корректный.");
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
