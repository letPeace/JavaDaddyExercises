package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(0,100));

        }

        for (Integer integer: set) {
            System.out.println(integer);
        }
    }
}
