package ChibuzorAssignment;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = inputs.nextInt();
        int factorial = 1;
        int count ;
        for (count = 1; count <= number; count++) {
            factorial = factorial * count;
        }
        System.out.println(factorial);

    }
}
