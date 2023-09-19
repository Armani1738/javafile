package JenifaAssignment;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 and number2: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int square1 = number1 * number1;
        int square2 = number2 * number2;
        int sum = (square1 + square2);
        int difference = (square1 - square2);

        System.out.println("number1 is :" + number1);
        System.out.println("number2 is :" + number2);
        System.out.println("square1 is :" + square1);
        System.out.println("square2 is :" + square2);
        System.out.println("sum is :" + sum);
        System.out.println("difference is:" + difference);

    }

}
