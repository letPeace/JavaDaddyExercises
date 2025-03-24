package mentorship.roadmap.Java_Core.step4_OOP.topic9_StrategyCommand.solution.commands;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
