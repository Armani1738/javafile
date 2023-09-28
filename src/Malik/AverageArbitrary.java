package Malik;

import java.util.Scanner;

public class AverageArbitrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int count = 0;
        int sum = 0;
        int average = 0;
        while (number != -1) {
            sum = number + sum;
            count += 1;
            System.out.println("Enter the number: ");
        }
        average = sum / count;
        System.out.printf("The sum of the number: ", sum);
        System.out.printf("The average of the number is:", average);
    }
}