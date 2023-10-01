package ChibuzorClassTask;

import java.util.Scanner;

public class SumOfEvenNumbersInScore4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int sum = 0;
        for (count = 1; count <= 10 ; count++) {
            System.out.println("Enter the score: ");
            int number = scanner.nextInt();
            if (number % 2 ==0){
                sum+=number;
            }
        }
        System.out.printf("the sum of Even numbers are:%d ", sum);
    }
}
