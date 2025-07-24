package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        int counter =0;
        for (int i = 0; i < 5; i++) {
            String some = "product" + counter;
            counter++;
            hashSet.add(some);
        }
        hashSet.add("product1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("apple");

        counter =0;
        for(String str: hashSet) {
            System.out.println("unique value №"+ counter +" - " + str);
            counter++;
        }

    }
}
