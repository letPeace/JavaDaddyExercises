package mentorship.roadmap.Java_Core.step6_Collections.List.task1_ArrayList.solution;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Добавление элементов
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Удаление элемента со значением 20
        list.remove(Integer.valueOf(20));
        // Перебор и вывод элементов
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
