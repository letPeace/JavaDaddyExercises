package mentorship.roadmap.Java_Core.step7_StreamApi.step1_LambdaExpressions.task4_Filter.solution;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : array) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 12, 7, 20, 3};
        List<Integer> filtered = filterArray(numbers, n -> n > 10);
        System.out.println("Числа больше 10: " + filtered);
    }
}
