package ChibuzorAssignment;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score size: ");
        int scoreSize = input.nextInt();
        int [] ray = new int [scoreSize];
        int max = ray[0];
        int score = ray[0];
        for (int count = 0; count < scoreSize; count++) {
            System.out.println("Enter the score: ");
            ray[score] = input.nextInt();
            }
            if (ray[score] > max){
                max = ray[score];
        }
        System.out.printf("The largest number is %d", max);

    }
}
