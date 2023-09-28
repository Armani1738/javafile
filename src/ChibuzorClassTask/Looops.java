package ChibuzorClassTask;

import java.util.Scanner;

public class Looops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        while (number < 0 || number > 10) {
            System.out.println("The number is not applicable: " + number);
            number = input.nextInt();
            number++;
        }
        System.out.println("The number is applicable: " + number);

    }
}