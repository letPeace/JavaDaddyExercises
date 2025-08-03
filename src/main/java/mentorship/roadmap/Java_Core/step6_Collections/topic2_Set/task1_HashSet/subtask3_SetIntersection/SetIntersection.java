package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask3_SetIntersection;

import java.util.Arrays;
import java.util.HashSet;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Андрей","Филипп","Наталья","Дмитрий"));
        HashSet<String> names2 = new HashSet<>(Arrays.asList("Филипп","Елена","Сергей","Наталья"));

        HashSet<String> copyNames1 = new HashSet<>(names1);
        copyNames1.retainAll(names2);
        System.out.println(copyNames1);
    }
}
