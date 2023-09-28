package Classtask;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 0; count < 10; count++) {
            System.out.println("Enter your scores: ");
            int Scores = input.nextInt();
            if (count % 2 == 0) {
                sum = sum + Scores;
            }

        }
        System.out.printf("the sum is:",sum);
    }
}


