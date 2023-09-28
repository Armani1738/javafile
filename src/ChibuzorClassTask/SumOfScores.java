package ChibuzorClassTask;

import java.util.Scanner;

public class SumOfScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the score: ");
//        int number = scanner.nextInt();
        int count;
        int sum = 0;
        for (count =1; count <=10; count++) {
            System.out.println("Enter the score:");
           int number = scanner.nextInt();
            sum+=number;
        }
        System.out.printf("The sum of score is:%d", sum);
    }
}
