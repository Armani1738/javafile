package Chapter2;

import java.util.Scanner;

public class SeperatingDigitInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int number = input.nextInt();

        int digit = number / 10000 % 10;
        int digit1= number / 1000 % 10;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number/ 1 % 10;

        System.out.printf("Seperate numbers are %d\t%d\t%d\t%d\t%d", digit,digit1,digit2,digit3,digit4);

    }

}
