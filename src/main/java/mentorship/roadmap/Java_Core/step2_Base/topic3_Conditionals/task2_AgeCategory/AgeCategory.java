package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task2_AgeCategory;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args){
        System.out.println("Введите возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 13){
            System.out.println("Ребёнок");
        } else if (age >= 13 & age < 19) {
            System.out.println("Подросток");
        } else if (age >= 20 & age < 64) {
            System.out.println("Взрослый");
        } else if (age >= 65) {
            System.out.println("Пожилой");
        }
    }
}
