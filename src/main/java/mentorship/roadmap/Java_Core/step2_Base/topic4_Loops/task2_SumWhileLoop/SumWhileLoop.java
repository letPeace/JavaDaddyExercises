package main.java.mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task2_SumWhileLoop;

public class SumWhileLoop {
    static void main() {
         int n = 101;
         int a = 1;
         int result = 0;
         while (a < n){
             result += a;
             a++;
         }
        System.out.println(result);
    }
}
