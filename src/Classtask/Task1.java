package Classtask;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int number = input.nextInt();
       int sum = 0;
        int number1;
        for (number1 = 0; number1 < 10; number1++) {
            sum += number;
           if (number >= 0 && number <= 10) {
                System.out.println("Enter the score: ");
                number = input.nextInt();
            }
        }
        System.out.printf("The sum of score is %d", sum);
    }
}

