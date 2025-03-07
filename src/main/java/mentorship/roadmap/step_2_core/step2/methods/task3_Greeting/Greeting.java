package mentorship.roadmap.step_2_core.step2.methods.task3_Greeting;

public class Greeting {

    public static String getGreeting(String name) {
        return "Привет, " + name + "!";
    }

    public static void main(String[] args) {
        String greeting = getGreeting("Алексей");
        System.out.println(greeting);
    }
}
