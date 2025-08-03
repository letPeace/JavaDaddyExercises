package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask3_QueueLinkedList;

import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();

        str.offer("One");
        str.offer("Two");
        str.offer("Three");
        str.offer("Four");
        System.out.println(str);

        while(!str.isEmpty()){
            System.out.println(str.poll());
        }
        System.out.println(str);
    }
}
