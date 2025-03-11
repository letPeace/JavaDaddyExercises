package mentorship.roadmap.Java_Core.step6_Collections.Map.task2_HashMapIter.solution;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 72);
        studentScores.put("Charlie", 90);
        studentScores.put("Diana", 68);

        int threshold = 75;
        System.out.println("Студенты, у которых баллы выше " + threshold + ":");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}
