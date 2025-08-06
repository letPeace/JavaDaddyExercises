package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask4_RemoveFromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFromList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Филипп","Наталья","Иван","Елена"));
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        names.remove("Елена");
        System.out.println(names);
    }
}
