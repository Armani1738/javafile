package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int count;
        int factorial = 1;
        for (count = 1; count <= number ; count++) {

            factorial *=count;
        }
        System.out.printf("The factorial of the number is: %d", factorial);
    }
}