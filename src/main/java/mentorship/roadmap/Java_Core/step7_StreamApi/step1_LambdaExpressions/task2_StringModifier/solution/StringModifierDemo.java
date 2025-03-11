package mentorship.roadmap.Java_Core.step7_StreamApi.step1_LambdaExpressions.task2_StringModifier.solution;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier modifier = s -> s.toUpperCase() + "!";
        String result = modifier.modify("hello");
        System.out.println("Результат обработки: " + result);
    }
}
