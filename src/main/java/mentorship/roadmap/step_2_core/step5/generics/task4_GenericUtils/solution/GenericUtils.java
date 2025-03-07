package mentorship.roadmap.step_2_core.step5.generics.task4_GenericUtils.solution;

public class GenericUtils {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
