package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask4_GroupByFirstLetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String[] names = {"Филипп", "Наташа", "Володя", "Виктор"};
        HashMap<Character, List<String>> namesMap = new HashMap<>();

        for (String name : names) {
            char first = name.charAt(0);
            if (namesMap.containsKey(first)) {
                List<String> list = namesMap.get(first);
                list.add(name);
            } else {
                List<String> list = new ArrayList<>();
                list.add(name);
                namesMap.put(first, list);
            }
        }
        System.out.println(namesMap);

    }
}
