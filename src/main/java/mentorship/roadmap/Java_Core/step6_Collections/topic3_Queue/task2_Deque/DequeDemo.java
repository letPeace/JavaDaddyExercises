package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(2);
        deque.addLast(3);
        deque.addFirst(1);

        deque.pollFirst();
        deque.pollLast();

        for (Integer integer: deque) {
            System.out.println(integer);
        }


    }
}
