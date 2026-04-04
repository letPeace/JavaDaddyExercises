package main.java.mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task3_FactorialWhile;

public class FactorialWhile {
    static void main() {
        int n = 6;
        int count = 1;
        int result = 1;
        while (count < n){
            result = result * count;
            count++;
        }
        System.out.println(result);
    }
}
