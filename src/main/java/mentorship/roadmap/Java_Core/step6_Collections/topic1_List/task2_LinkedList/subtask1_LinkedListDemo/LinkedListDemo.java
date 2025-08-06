package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask1_LinkedListDemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> demoList = new LinkedList<>(Arrays.asList("One","Two","Three"));
        System.out.println(demoList);
        demoList.addFirst("First");
        demoList.addLast("Last");
        System.out.println(demoList);
        demoList.removeFirst();
        demoList.removeLast();
        for (String str : demoList){
            System.out.println(str);
        }
    }
}
