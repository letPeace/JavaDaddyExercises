package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask2_TreeSetWithComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(Comparator.reverseOrder());
        words.addAll(Arrays.asList("Banana","Apple","Orange"));
        System.out.println(words);
        for (String word : words){
            System.out.println(word);
        }
    }
}
