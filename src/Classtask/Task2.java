package Classtask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average = 0;
        int count = 1;
        while (count <= 10) {
            System.out.print("Enter the score: ");
            int number = input.nextInt();
            count++;
            average = number / count;
        }
        System.out.print("The average score is %" + average);
    }
}
