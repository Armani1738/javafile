package Chapter2;

import java.util.Scanner;

public class Multiplies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second integer: ");
        int secondNumber = input.nextInt();

        int number = firstNumber * firstNumber * firstNumber;
        int number2 = secondNumber * secondNumber;
        int sum = number + number2 ;

        if (number >= number2){
            System.out.print("number is doubled");
        }
        else if(number <= number2){
            System.out.println("number is not doubled");
        }
    }
}
