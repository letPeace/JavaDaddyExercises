package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task4_ArrayListSort;

import java.util.*;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int counter = 0;
        Random random = new Random();
        while(counter < 5) {
            arr.add(random.nextInt());
            counter++;
        }
        Collections.sort(arr);
        System.out.println(arr);

    }
}
