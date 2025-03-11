package mentorship.roadmap.Java_Core.step7_StreamApi.Streams.task4_CountEvenNumbers.solution;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        long countEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Количество чётных чисел: " + countEven);
    }
}
