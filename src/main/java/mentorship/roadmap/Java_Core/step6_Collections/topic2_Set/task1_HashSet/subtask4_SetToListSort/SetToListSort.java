package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask4_SetToListSort;

import java.util.*;

public class SetToListSort {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(Arrays.asList(1,14,23,2,6,3,11,9));
        List<Integer> numsList = new ArrayList<>(nums);
        Collections.sort(numsList);

        System.out.println(numsList);
    }
}
