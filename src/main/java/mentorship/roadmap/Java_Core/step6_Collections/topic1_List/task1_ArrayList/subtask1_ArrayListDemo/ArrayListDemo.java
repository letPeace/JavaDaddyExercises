package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask1_ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> demoList = new ArrayList<>(Arrays.asList(10, 2, 20, 591, 14));

        demoList.remove(Integer.valueOf(20));

        for (Integer v : demoList) {
            System.out.println(v);
        }
    }
}
