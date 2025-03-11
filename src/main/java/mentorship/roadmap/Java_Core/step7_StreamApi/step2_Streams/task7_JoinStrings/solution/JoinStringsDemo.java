package mentorship.roadmap.Java_Core.step7_StreamApi.step2_Streams.task7_JoinStrings.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "yellow");

        String result = colors.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Объединённая строка: " + result);
    }
}
