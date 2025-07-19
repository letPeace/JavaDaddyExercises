package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task2_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> studInfo = new HashMap<>();
        studInfo.put("Alice", 85);
        studInfo.put("Bob", 72);
        studInfo.put("Charlie", 90);
        studInfo.put("Diana", 68);

        for (Map.Entry<String,Integer> map: studInfo.entrySet()) {
            if (map.getValue() > 75) {
                System.out.println(map.getKey());
            }
        }
    }
}
