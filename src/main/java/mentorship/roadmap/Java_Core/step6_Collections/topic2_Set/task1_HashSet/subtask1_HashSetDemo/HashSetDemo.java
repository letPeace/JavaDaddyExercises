package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask1_HashSetDemo;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>(Arrays.asList("Apple","Banana","Orange","Apple"));

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
