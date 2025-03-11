package mentorship.roadmap.Java_Core.step6_Collections.Queue.task2_Deque.solution;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Добавляем элементы: сначала 10, потом 20 в конец
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);

        // Удаляем элементы с начала и конца
        System.out.println("Удалено с начала: " + deque.pollFirst());
        System.out.println("Удалено с конца: " + deque.pollLast());

        // Вывод оставшихся элементов
        System.out.println("Оставшиеся элементы:");
        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}
