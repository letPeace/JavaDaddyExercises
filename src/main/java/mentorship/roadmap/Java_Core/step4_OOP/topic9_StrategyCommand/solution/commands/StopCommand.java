package mentorship.roadmap.Java_Core.step4_OOP.topic9_StrategyCommand.solution.commands;

public class StopCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Stopping...");
    }
}
