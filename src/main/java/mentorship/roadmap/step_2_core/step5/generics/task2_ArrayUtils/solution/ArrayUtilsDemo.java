package mentorship.roadmap.step_2_core.step5.generics.task2_ArrayUtils.solution;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("До обмена: " + Arrays.toString(numbers));
        ArrayUtils.swap(numbers, 1, 3);
        System.out.println("После обмена: " + Arrays.toString(numbers));
    }
}
