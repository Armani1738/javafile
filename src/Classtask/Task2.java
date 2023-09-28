package Classtask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int number = input.nextInt();
        int average;
        int count = 1;
        while (count <= 10) {
            count++;
            if (number >= 0 && number <= 10) {
                System.out.println("Enter the score: ");
                number = input.nextInt();
            }
        }
        average = number / count;
        System.out.printf("\nThe average score is %d", average);
    }
}
