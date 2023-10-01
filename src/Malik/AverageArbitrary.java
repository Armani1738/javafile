package Malik;

import java.util.Scanner;

public class AverageArbitrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int count = 0;
        int sum = 0;
        double average;
        while (number != -1) {
            sum = number + sum;
            count += 1;
            System.out.println("Enter the number: ");
            number = input.nextInt();
        }
        average =(double) sum / count;
        System.out.printf("\nThe sum of the number:%d", sum);
        System.out.printf("\nThe average of the number is:%f", average);
    }
}