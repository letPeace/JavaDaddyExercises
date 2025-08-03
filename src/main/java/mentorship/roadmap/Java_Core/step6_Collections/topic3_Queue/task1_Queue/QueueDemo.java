package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task1_Queue;

import java.util.LinkedList;

import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue.peek());
        while(!queue.isEmpty()) {
            String a =queue.poll();
            System.out.println(a);
        }

    }
}
