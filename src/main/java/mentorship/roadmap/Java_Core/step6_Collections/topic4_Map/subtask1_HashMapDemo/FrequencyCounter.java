package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask1_HashMapDemo;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] fruitsArr = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String,Integer> fruitsMap = new HashMap<>();

        for (String fruit: fruitsArr){
            fruitsMap.put(fruit,fruitsMap.getOrDefault(fruit,0)+1);
        }
        System.out.println(fruitsMap);
    }
}
