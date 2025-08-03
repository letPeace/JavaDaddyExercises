package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask4_SetToListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SetToListSort {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1,14,23,2,6,3,11,9));
        ArrayList<Integer> numsList = new ArrayList<>(nums);
        Collections.sort(numsList);

        System.out.println(numsList);
    }
}
