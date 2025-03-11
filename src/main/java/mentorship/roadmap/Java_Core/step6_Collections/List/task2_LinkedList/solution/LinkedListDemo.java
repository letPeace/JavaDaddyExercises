package mentorship.roadmap.Java_Core.step6_Collections.List.task2_LinkedList.solution;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        // Добавление элементов
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Добавляем элемент в начало и в конец
        list.addFirst("Zero");
        list.addLast("Four");

        // Удаляем первый и последний элементы
        list.removeFirst();
        list.removeLast();

        // Выводим оставшиеся элементы
        for (String item : list) {
            System.out.println(item);
        }
    }
}
