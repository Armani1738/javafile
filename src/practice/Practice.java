package practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int total = 0;
        int number = 0;
        for (int count = 1; count <= 10; count+=2) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number  >= 100){
                System.out.println("number is not applicable");
            }
            total += number;
        }
        average = total / number;
        System.out.println("The average of the number is:"+ average);
        System.out.println("The total of the number is: "+ total);

    }
}
