package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask5_ListInterfaceDemo;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> demoList = new LinkedList<>();
        demoList.add(0,"A");
        demoList.add(1,"B");
        demoList.add(2,"C");
        demoList.add(3,"D");

        demoList.set(2,"S");
        demoList.remove(3);

        for (int i=0; i<demoList.size(); i++){
            System.out.println(demoList.get(i));
        }

    }
}
