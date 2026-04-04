package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task6_PositiveCheckTernary;

import java.util.Scanner;

public class PositiveCheckTernary {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = (number > 0) ? "Положительное" : "Отрицательное";
        System.out.println(result);
    }
}
