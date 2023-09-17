package Chapter2;

import java.util.Scanner;

import static java.lang.System.in;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.print("Enter the integer: ");
        int number = input.nextInt();
        int square = number * number;

        if (number < 100) {
            System.out.print("\n is less than hundred");
        }
        if (number > 100) {
            System.out.print("\n greater than hundred");
        }
        if (number == 100) {
            System.out.print("\n Number is Equal");
        }  if (number != 100) {
            System.out.print("\n Not equal to 100");
        }
        if (square < 100) {
            System.out.print("\n square of number is less nthan 100");
        }
        if (square > 100){
            System.out.print("\n square of number is greater than 100");
        }
        if (square == 100){
            System.out.print("\n square of number is equal to 100");
        }
        if (square != 100){
            System.out.print("\n square of number is not equal to 100");
        }
        System.out.printf("\n square of number is %d",+ square);

    }


    }

