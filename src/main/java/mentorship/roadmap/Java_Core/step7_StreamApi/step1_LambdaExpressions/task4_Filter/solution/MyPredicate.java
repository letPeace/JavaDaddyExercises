package mentorship.roadmap.Java_Core.step7_StreamApi.step1_LambdaExpressions.task4_Filter.solution;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
