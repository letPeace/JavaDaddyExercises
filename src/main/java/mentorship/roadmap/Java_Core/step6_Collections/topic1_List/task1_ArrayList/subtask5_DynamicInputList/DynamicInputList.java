package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask5_DynamicInputList;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInputList {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("стоп")) {
                break;
            } else{
                str.add(input);
            }
        }
        System.out.println(str.size());
        System.out.println(str);
    }
}
