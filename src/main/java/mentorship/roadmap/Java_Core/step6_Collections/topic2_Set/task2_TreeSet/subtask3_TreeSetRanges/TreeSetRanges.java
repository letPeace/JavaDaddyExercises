package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask3_TreeSetRanges;

import java.util.TreeSet;

public class TreeSetRanges {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            nums.add(i);
        }
        System.out.println(nums.headSet(10));
        System.out.println(nums.tailSet(10));
        System.out.println(nums.subSet(5, 15));
    }
}
