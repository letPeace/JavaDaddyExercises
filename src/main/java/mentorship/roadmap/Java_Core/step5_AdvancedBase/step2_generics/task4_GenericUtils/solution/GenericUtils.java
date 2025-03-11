package mentorship.roadmap.Java_Core.step5_AdvancedBase.step2_generics.task4_GenericUtils.solution;

public class GenericUtils {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
