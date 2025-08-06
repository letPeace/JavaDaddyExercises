package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask7_GroupByLength;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByLength {
    public static void main(String[] args) {
        String[] words = {"hi", "hello", "hey", "hola", "yo", "bonjour"};
        Map<Integer, List<String>> wordsMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            wordsMap.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }
        System.out.println(wordsMap);
    }
}
