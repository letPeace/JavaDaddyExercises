package java.mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task4_CharAtDemo;

import java.util.Scanner;

public class CharAtDemo {
    public CharAtDemo() {
    }

    public static void main(String[] args) {
        String newString = "abcdef";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("index: ");
        int index = myScanner.nextInt();
        char letter = newString.charAt(index);
        System.out.println(letter);
    }
}

