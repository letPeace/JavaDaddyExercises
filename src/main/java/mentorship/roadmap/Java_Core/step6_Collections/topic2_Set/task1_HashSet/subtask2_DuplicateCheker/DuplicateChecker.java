package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask2_DuplicateCheker;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) {


        Set<String> demoHash = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("стоп")) {
                break;
            } if (demoHash.contains(input)){
                    System.out.println("Дубликат!");
                }
            demoHash.add(input);
        }
        System.out.println(demoHash);
    }
}
