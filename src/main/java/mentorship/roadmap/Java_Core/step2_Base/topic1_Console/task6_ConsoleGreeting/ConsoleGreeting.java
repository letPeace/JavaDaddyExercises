package java.mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task6_ConsoleGreeting;

import java.util.Scanner;

public class ConsoleGreeting {
    public ConsoleGreeting() {
    }

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner myScanner = new Scanner(System.in);
        String userName = myScanner.nextLine();
        System.out.println("Hello " + userName + "! Welcome to Java!");
    }}
