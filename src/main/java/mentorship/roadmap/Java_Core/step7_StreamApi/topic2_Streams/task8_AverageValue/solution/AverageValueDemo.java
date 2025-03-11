package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task8_AverageValue.solution;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        OptionalDouble average = numbers.stream()
                .mapToInt(n -> n)
                .average();

        average.ifPresent(avg -> System.out.println("Среднее значение: " + avg));
    }
}