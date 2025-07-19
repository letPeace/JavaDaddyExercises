package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(40);
        arr.add(60);
        arr.add(80);

//        Iterator<Integer> itr = arr.listIterator();
//        while(itr.hasNext()) {
//            if (itr.next() == 20) itr.remove();
//        }
        arr.removeIf(integer -> integer == 20);

        for(Integer i : arr) System.out.println("element number + " + i);
    }

}
