package Chapter2;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number;
        number = input.nextInt();
        if(number %3==0){
            System.out.print("number is divisible");
        }
        else if (number%3 != 0 ) {
            System.out.print("number is not divisible");

        }


    }
}
