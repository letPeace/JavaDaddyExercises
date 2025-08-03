package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] str = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        Map<String, Integer> hashMap = new HashMap<>();
        for (String atr1 : str) {
            hashMap.put(atr1, hashMap.getOrDefault(atr1,0) + 1);
        }
        for (Map.Entry<String,Integer> map : hashMap.entrySet()) {
            System.out.println("Frequency = " + map.getKey() + " | Value = " + map.getValue());
        }
    }
}
