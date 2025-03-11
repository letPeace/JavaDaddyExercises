package mentorship.roadmap.Java_Core.step5_AdvancedBase.generics.task1_Pair.solution;

public class PairDemo {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair);

        pair.setFirst("New Age");
        pair.setSecond(35);
        System.out.println("First: " + pair.getFirst() + ", Second: " + pair.getSecond());
    }
}
