package mentorship.roadmap.step_2_core.step2.console.CharAtDemo;

public class CharAtDemo {

    public static void main(String[] args) {
        String word = "Java";
        char ch = word.charAt(2); // индекс начинается с 0, получаем 'v'
        System.out.println("Символ на позиции 3: " + ch);
    }
}
