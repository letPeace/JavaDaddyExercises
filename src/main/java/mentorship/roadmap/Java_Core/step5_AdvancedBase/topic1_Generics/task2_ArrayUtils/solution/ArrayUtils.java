package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils.solution;

public class ArrayUtils {

    public static <T> void swap(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IllegalArgumentException("Неверные индексы или массив");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
