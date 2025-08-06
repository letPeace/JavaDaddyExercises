package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask3_TopScoper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopScorer {
    public static void main(String[] args) {
        Map<String, Integer> personsPoints = new HashMap<>();
        personsPoints.put("Alex", 22);
        personsPoints.put("Carl", 89);
        personsPoints.put("Bob", 62);

        Integer maxPoints = 0;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : personsPoints.entrySet()) {
            if(entry.getValue()>maxPoints){
                maxPoints = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey+" "+maxPoints);
    }
}
