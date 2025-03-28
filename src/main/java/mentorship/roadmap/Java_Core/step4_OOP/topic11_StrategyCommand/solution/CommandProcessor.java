package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.solution;

import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.solution.commands.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {
    private Map<String, Command> commandMap = new HashMap<>();
    private Scanner scanner;

    public CommandProcessor() {
        commandMap.put("start", new StartCommand());
        commandMap.put("stop", new StopCommand());
        commandMap.put("pause", new PauseCommand());
        commandMap.put("exit", new ExitCommand());
        scanner = new Scanner(System.in);
    }

    public void process() {
        System.out.println("Commands: start, stop, pause, exit");
        while (true) {
            System.out.println("Enter command: ");
            Command command = commandMap.get(scanner.nextLine());
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
