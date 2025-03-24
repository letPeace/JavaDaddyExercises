package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort.solution;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] words = {"Java", "Lambda", "Stream", "API"};

        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Отсортированный массив по длине: " + Arrays.toString(words));
    }
}
