package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask1_TreeSetDemo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>(Arrays.asList(50,20,40,10,30));
        System.out.println(nums);
        for (Integer num : nums){
            System.out.println(num);
        }
    }
}
