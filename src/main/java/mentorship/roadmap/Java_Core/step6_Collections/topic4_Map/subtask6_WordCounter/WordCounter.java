package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask6_WordCounter;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "dog", "bird", "cat", "dog"};
        HashMap<String,Integer> words = new HashMap<>();
        for (String word: animals){
            words.put(word,words.getOrDefault(word,0)+1);
        }
        System.out.println(words);
    }
}
