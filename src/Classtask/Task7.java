package Classtask;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Enter ten scores: ");
            int Scores = input.nextInt();
            sum = sum + Scores;
        }
    }
}
