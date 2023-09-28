package Classtask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum = 0;
        do {
            System.out.println("Enter the first num: ");
            number1 = input.nextInt();
            System.out.print("Enter second number: ");
            number2 = input.nextInt();
            sum = number1 + number2;
            System.out.println(sum);
        } while (number1 != -0 && number2 != -0);
    }
}

