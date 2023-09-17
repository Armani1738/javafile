package Chapter2;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter the number3: ");
        int number3 = input.nextInt();
        System.out.println("Enter the number4: ");
        int number4 = input.nextInt();
        if(number > 0){
            System.out.println("positive");
        }
        if(number1 > 0){
            System.out.println("positive");
        }
        if(number2 > 0){
            System.out.println("positive");
        }
        if(number3 > 0){
            System.out.println("positive");
        }
        if(number4 > 0){
            System.out.println("positive");
        }
        if(number < 0){
            System.out.println("Negative");
        }if(number1 < 0){
            System.out.println("Negative");
        }if(number2 < 0){
            System.out.println("Negative");
        }if(number3 < 0){
            System.out.println("Negative");
        }if(number4 < 0){
            System.out.println("Negative");
        }
        if(number == 0){
            System.out.println("Zero");
        }if(number1 == 0){
            System.out.println("Zero");
        }if(number2 == 0){
            System.out.println("Zero");
        }if(number3 == 0){
            System.out.println("Zero");
        }if(number4 == 0){
            System.out.println("Zero");
        }

    }
}
