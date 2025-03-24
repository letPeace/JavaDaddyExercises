package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString.solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");

        Optional<String> shortest = words.stream()
                .min(Comparator.comparingInt(String::length));

        shortest.ifPresent(s -> System.out.println("Самая короткая строка: " + s));
    }
}
