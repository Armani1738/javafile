package ChibuzorClassTask;

import java.util.Scanner;
public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = input.nextInt();
        int[] ray = new int[10];
        int max = ray[0];
        int min = ray[0];
        int total = ray[0];
        int average = 0;
        for (int count = 0; count <=score; count++) {
            System.out.println("Enter the score: ");
            ray[score] = input.nextInt();
            total +=score;
            average = total / score;
        }
        if (ray[score] > max) {
            max = ray[score];
        }if (ray[score] < min){
            min = ray[score];
        }
        System.out.printf("The Maximuim number is %d", max);
        System.out.printf("The Minimium number is %d", min);
        System.out.printf("The total number is %d", total);
        System.out.printf("The average number is %d", average);
    }
}
