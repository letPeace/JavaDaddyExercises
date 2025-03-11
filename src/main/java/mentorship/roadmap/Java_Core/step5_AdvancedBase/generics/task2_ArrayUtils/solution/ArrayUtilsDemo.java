package mentorship.roadmap.Java_Core.step5_AdvancedBase.generics.task2_ArrayUtils.solution;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("До обмена: " + Arrays.toString(numbers));
        ArrayUtils.swap(numbers, 1, 3);
        System.out.println("После обмена: " + Arrays.toString(numbers));
    }
}
