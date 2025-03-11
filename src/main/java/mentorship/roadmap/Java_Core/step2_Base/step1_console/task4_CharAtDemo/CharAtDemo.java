package mentorship.roadmap.Java_Core.step2_Base.step1_console.task4_CharAtDemo;

public class CharAtDemo {

    public static void main(String[] args) {
        String word = "Java";
        char ch = word.charAt(2); // индекс начинается с 0, получаем 'v'
        System.out.println("Символ на позиции 3: " + ch);
    }
}
