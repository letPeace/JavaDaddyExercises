package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask2_SearchIInList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchInList {
    public static void main(String[] args) {

        ArrayList<String> demoList = new ArrayList<>(Arrays.asList("Иван", "Елена", "Филипп", "Наталья"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String str = scanner.nextLine();

        if (demoList.contains(str)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }

    }
}
