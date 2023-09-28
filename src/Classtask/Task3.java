package Classtask;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the score: ");
            int number = input.nextInt();
            int count = 1;
            int sum = 0;
            int average;
            while (count <= 10) {
                count++;
                sum += number;
                if (number >= 0 && number <= 10) {
                    System.out.println("Enter the score: ");
                    number = input.nextInt();
                }
            }
            average = sum / count;
            System.out.printf("The sum of score is %d", sum);
            System.out.printf("\nThe average score is %d", average);
        }
    }