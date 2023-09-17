package practice;

import java.util.Scanner;

public class Stage1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 to 100: ");
        int number = scanner.nextInt();
        if(number >= 1 && number< 30){
            System.out.println("Low level");
        }else if (number >=30 && number <= 50){
            System.out.println("Average");
        } else if (number >= 51 && number <= 80) {
            System.out.println("High level");
        } if (number >= 81 && number <= 100) {
            System.out.println("A-level");

        }
    }
}
