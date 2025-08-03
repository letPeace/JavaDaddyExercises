package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask2_StackLinkedList;

import java.util.LinkedList;

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> demoList = new LinkedList<>();

        demoList.push(1);
        demoList.push(2);
        demoList.push(3);
        demoList.push(4);

        System.out.println(demoList);

        while(!demoList.isEmpty()){
            System.out.println(demoList.pop());
        }

        System.out.println(demoList);
    }
}
