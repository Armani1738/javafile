package ChibuzorClassTask;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        while (number < 0 || number > 10) {
            System.out.printf("the number is not between one and ten: ", number);
            number = input.nextInt();

        }

        System.out.printf("number is between one and ten", number);

    }
}