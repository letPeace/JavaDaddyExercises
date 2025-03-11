package mentorship.roadmap.Java_Core.step2_Base.step8_methods.task3_Greeting;

public class Greeting {

    public static String getGreeting(String name) {
        return "Привет, " + name + "!";
    }

    public static void main(String[] args) {
        String greeting = getGreeting("Алексей");
        System.out.println(greeting);
    }
}
