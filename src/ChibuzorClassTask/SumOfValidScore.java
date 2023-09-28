package ChibuzorClassTask;

import java.util.Scanner;

public class SumOfValidScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int sum = 0;
        for (count = 0; count <10; count++) {
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            if(number >100 || number <0){
                System.out.println("Number not applicable");
            }else
                sum+=number;
        }
        System.out.printf("The sum of numbers between 0 and 100: %d", sum);
    }
}
