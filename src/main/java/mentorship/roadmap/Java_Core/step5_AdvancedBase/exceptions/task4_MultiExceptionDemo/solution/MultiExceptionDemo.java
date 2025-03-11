package mentorship.roadmap.Java_Core.step5_AdvancedBase.exceptions.task4_MultiExceptionDemo.solution;

public class MultiExceptionDemo {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        String text = null;

        try {
            // Попытка обращения к несуществующему элементу массива
            System.out.println(numbers[5]);
            // Попытка вызвать метод у null-объекта
            System.out.println(text.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Произошло исключение: " + e.getClass().getSimpleName());
        }
    }
}
