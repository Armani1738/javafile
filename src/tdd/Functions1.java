package tdd;

import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = inputs.nextInt();

        System.out.println("Enter the number: ");
        int multiple = 1;
        int count ;
        for (count = 1; count == number; count++) {
            multiple = (multiple) + (count);
        }
        System.out.println(multiple);

    }
}

