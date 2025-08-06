package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask6_PerformanceCompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceCompare {
    public static void main(String[] args) {
        List<Integer> testAl = new ArrayList<>();
        LinkedList<Integer> testLl = new LinkedList<>();


        long startTimeAl = System.nanoTime();
        for (int i = 0; i <= 99999; i++) {
            testAl.add(i);
        }
        long endTimeAl = System.nanoTime();
        System.out.println(endTimeAl - startTimeAl);


        long startTimeLl = System.nanoTime();
        for (int i = 0; i <= 99999; i++) {
            testLl.add(i);
        }
        long endTimeLl = System.nanoTime();
        System.out.println(endTimeLl - startTimeLl);

        long startTime = System.nanoTime();
        for (int i =0; i<=9999;i++){
            testAl.addFirst(i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);

        long start = System.nanoTime();
        for(int i=0; i<=9999; i++){
            testLl.addFirst(i);
        }
        long end = System.nanoTime();
        System.out.println(end-start);

    }
}
