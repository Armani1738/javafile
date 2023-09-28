package ChibuzorClassTask;

import java.util.Scanner;

public class dowhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit;
        do {
            System.out.println("Enter correct number: ");
            digit = input.nextInt();
        } while (digit < 0 || digit > 10);
        System.out.println(digit +"number is correct");

    }
}
