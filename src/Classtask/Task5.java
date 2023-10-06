package Classtask;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int Scores = 0;
        for (int count = 0; count < 10; count++) {
            if (count % 2 == 0) {
                sum = sum + Scores;
            System.out.println("Enter your scores: ");
            Scores = input.nextInt();

            }
        }

        System.out.printf("the sum is:", sum);
    }
}


