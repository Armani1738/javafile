package Chapter2;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the firstNumber: ");
        int firstNumber = inputs.nextInt();
        System.out.println("Enter the secondNumber: ");
        int secondNumber = inputs.nextInt();
        System.out.println("Enter the thirdNumber: ");
        int thirdNumber = inputs.nextInt();
        System.out.println("Enter the fourthNumber: ");
        int fourthNumber = inputs.nextInt();
        System.out.println("Enter the fifthNumber: ");
        int fifthNumber = inputs.nextInt();

        int smallest = 0;
        int largest = 0;

        if(firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){
            largest = firstNumber;
        }
        if(secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){
            largest = secondNumber;
        }
        if(thirdNumber > secondNumber && thirdNumber > firstNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){
            largest = thirdNumber;
        }
        if(fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > firstNumber && fourthNumber > fifthNumber){
            largest = fourthNumber;
        }
        if(fifthNumber > secondNumber && fifthNumber > firstNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){
            largest = fifthNumber;
        }
        System.out.printf("the largest is %d\n", largest);
        if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){
            smallest = firstNumber;
        }
        if(secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
            smallest = secondNumber;
        }
        if(thirdNumber < secondNumber && thirdNumber < firstNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
            smallest = thirdNumber;
        }
        if(fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < firstNumber && fourthNumber < fifthNumber){
            smallest = fourthNumber;
        }
        if(fifthNumber < secondNumber && fifthNumber < firstNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){
            smallest = fifthNumber;
        }
        System.out.printf("the smallest number is: %d", smallest);

    }
}