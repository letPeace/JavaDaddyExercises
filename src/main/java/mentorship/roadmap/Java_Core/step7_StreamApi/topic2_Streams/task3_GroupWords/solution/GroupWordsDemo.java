package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task3_GroupWords.solution;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot");

        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        grouped.forEach((letter, list) -> System.out.println(letter + ": " + list));
    }
}
