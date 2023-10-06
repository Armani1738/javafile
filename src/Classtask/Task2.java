package Classtask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average = 0;
        int count = 1;
        int number = 0;
        while (count <= 10) {
            average = number / count;
            count++;
            System.out.print("Enter the score: ");
            number = input.nextInt();
        }
        
        System.out.print("The average score is %" + average);
    }
}
