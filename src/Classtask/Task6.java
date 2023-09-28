package Classtask;

import java.util.Scanner;

public class Task6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int count;
            int average = 0;
            for (count = 0; count < 10; count++) {
                System.out.println("Enter your scores: ");
                int Scores = input.nextInt();
                if (count % 2 == 0) {
                    sum = sum + Scores;
                }
            }
            average = sum / count;
            System.out.printf("the sum of scores is %d", sum);
            System.out.printf("\n the sum of average is %d", average);
        }
    }

