package Malik;

import java.util.Scanner;

public class Calculatingclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first student grade: ");
        int number = input.nextInt();
        int count = 1;
        int sum = 0;
        int average;
    while (count <= 10){
        count ++;
        sum += number;
        if (number >= 0 && number < 100) {
            System.out.println("Enter the first student grade: ");
            number = input.nextInt();
        }
        }
        average = sum / count;
        System.out.printf("The sum of grade is %d", sum);
        System.out.printf("\nThe average grade is %d", average);

    }
}
