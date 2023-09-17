package ChibuzorAssignment;

import java.util.Scanner;

public class   LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int largest =number;
        int smallest = number;
        int number1;
        for (number1 = 0; number !=-0; number1++) {
           System.out.println("\nEnter the number: ");
            number = input.nextInt();
            if (number > largest && number != -0) {
                largest = number;
            }
            if (number < smallest && number != -0) {
                smallest = number;

            }
            System.out.printf("the largest is:%d\n", largest);
            System.out.printf("the smallest is:%d", smallest);
        }


    }
}
