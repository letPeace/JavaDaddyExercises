package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task1_Queue.solution;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Добавляем элементы в очередь
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // Просмотр первого элемента без удаления
        System.out.println("Первый элемент (peek): " + queue.peek());

        // Извлечение элементов с очереди
        while (!queue.isEmpty()) {
            System.out.println("Извлечён элемент: " + queue.poll());
        }
    }
}
