package Chapter2;

import java.util.Scanner;

public class ArithmeticsSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter the integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter the integer: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;
        int largest = 0;
        int smallest = 0;

        if (number1 > number2 && number1 > number3){
            largest = number1;
        } else if (number2 > number1 && number2 > number3) {
            largest = number2;
        }
        else if (number3 > number1 && number3 > number2){
            largest = number3;
        }
        if (number1 < number2 && number1 < number3){
            smallest = number1;
        } else if (number2 < number1 && number2 < number3) {
            smallest = number2;
        }
        else if (number3 < number1 && number3 < number2){
            smallest = number3;
        }
        System.out.println("The sum of the three numbers is "+ sum);
        System.out.println("The average of the three numbers is "+ average);
        System.out.println("The product of the three numbers is "+ product);
        System.out.println("The largest of the three numbers is "+ largest);
        System.out.println("The smallest of the three numbers is "+ smallest);
    }
}
