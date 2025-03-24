package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task4_ArrayListSort.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(17);
        numbers.add(8);
        numbers.add(99);
        numbers.add(23);

        // Сортировка списка
        Collections.sort(numbers);

        // Вывод отсортированного списка
        System.out.println("Отсортированный список: " + numbers);
    }
}

