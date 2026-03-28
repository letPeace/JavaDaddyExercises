package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task5_MaxOfThree;

import java.util.Scanner;

public class MaxOfTree {
    public static void main(String[] args){
        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b & a > c){
            System.out.println("a - наибольшее!");
        } else if (b > a & b < c) {
            System.out.println("c - наибольшее");
        } else if (c > a & c > b) {
            System.out.println("b - наибольшее");
        }
        else{
            System.out.println("error!");
        }
    }
}
