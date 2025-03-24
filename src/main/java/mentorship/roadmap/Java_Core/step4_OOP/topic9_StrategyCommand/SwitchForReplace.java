package mentorship.roadmap.Java_Core.step4_OOP.topic9_StrategyCommand;

import java.util.Scanner;

public class SwitchForReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Commands: start, stop, pause, exit");
        while (true) {
            System.out.println("Enter command: ");
            String command = input.nextLine();
            switch (command) {
                case "start" -> System.out.println("Starting...");
                case "stop" -> System.out.println("Stopping...");
                case "pause" -> System.out.println("Pausing...");
                case "exit" -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Unknown command");
            }
        }
    }
}
