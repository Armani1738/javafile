package ChibuzorClassTask;

import java.util.Scanner;
public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int max = 0;
        int min = 0;
        double average;
        int sum = 0;
        for (count = 1; count <= 3; count++) {
            System.out.println("Enter the score: ");
            int number = scanner.nextInt();
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        average = (double) sum / count;
        System.out.printf("\nthe sum of numbers are:%d ", sum);
        System.out.printf("\nThe Maximuim number is %d", max);
        System.out.printf("\nThe Minimium number is %d", min);
        System.out.printf("\nThe average number is %f", average);
    }
}
