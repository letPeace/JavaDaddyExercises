package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task1_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> liters = new LinkedList<>();
        liters.offer("A");
        liters.offer("B");
        liters.offer("C");

        System.out.println(liters.peek());

        while(!liters.isEmpty()){
            System.out.println(liters.poll());
        }

        System.out.println(liters.peek());

    }
}
