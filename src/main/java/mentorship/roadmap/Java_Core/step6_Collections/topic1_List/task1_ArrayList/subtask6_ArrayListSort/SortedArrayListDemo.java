package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask6_ArrayListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedArrayListDemo {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(42,17,8,99,23));

    Collections.sort(numbers);

        System.out.println(numbers);

    }
}
