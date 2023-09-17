package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer:");
        int number = input.nextInt();
        System.out.print("Enter the number:");
        int number1 = input.nextInt();

        number = number * number;
        number1 = number1 * number1;
        int sum = number - number1;
        System.out.printf("%d", sum);


    }
}
