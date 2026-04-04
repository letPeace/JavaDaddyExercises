package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task7_MinOfTwoTernary;

import java.util.Scanner;

public class MinOfTwoTernary {
    public static void main(String[] args){
        System.out.println("Введите 2 числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = (a > b) ?  "a - больше чем b" : (a < b) ? "b - больше чем a" : "Числа равны";
        System.out.println(result);
    }
}
