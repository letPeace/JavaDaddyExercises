package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();
        arr.add("Two");
        arr.addLast("Three");
        arr.addFirst("One");
        System.err.println("BEFORE REMOVAL");
        System.out.println();
        for(String str : arr) System.out.println(str);
        System.out.println();
        System.out.println("AFTER REMOVAL");
        System.out.println();
        arr.removeFirst();
        arr.removeLast();
        for(String str : arr) System.out.println(str);

    }
}
