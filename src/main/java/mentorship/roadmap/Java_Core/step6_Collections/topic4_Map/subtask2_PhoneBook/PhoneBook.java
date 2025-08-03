package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask2_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Филипп", "7 222 999 99 99");
        phoneBook.put("Наталья", "7 111 888 88 88");
        phoneBook.put("Петр", "7 888 777 22 11");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(phoneBook.getOrDefault(input,"Не найдено"));


        }
    }

