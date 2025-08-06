package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask3_MergeLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {

        List<String> first = new ArrayList<>(Arrays.asList("А", "Б", "В", "Г"));
        List<String> second = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> third = new ArrayList<>();

        third.addAll(first);
        third.addAll(second);

        System.out.println(third);

        for (String str : third) {
            System.out.println(str);
        }

    }
}
