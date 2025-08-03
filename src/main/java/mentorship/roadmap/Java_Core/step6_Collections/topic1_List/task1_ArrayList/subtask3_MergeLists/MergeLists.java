package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask3_MergeLists;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>(Arrays.asList("А", "Б", "В", "Г"));
        ArrayList<String> second = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> third = new ArrayList<>();

        third.addAll(first);
        third.addAll(second);

        System.out.println(third);

        for(String str : third){
            System.out.println(str);
        }

    }
}
