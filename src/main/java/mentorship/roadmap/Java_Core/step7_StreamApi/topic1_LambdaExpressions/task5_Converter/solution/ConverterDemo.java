package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task5_Converter.solution;

import java.util.Arrays;

public class ConverterDemo {
    public static int[] convertArray(int[] array, Converter converter) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = converter.convert(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] squares = convertArray(numbers, x -> x * x);
        System.out.println("Квадраты чисел: " + Arrays.toString(squares));
    }
}
