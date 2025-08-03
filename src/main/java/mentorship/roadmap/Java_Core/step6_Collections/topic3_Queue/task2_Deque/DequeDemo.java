package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> nums = new LinkedList<>();
        nums.addFirst(23);
        nums.addFirst(2);
        nums.addFirst(11);
        nums.addLast(4);
        nums.addLast(5);
        nums.addLast(6);

        nums.pollFirst();
        nums.pollLast();

        for(Integer num : nums){
            System.out.println(num);
        }

    }
}
