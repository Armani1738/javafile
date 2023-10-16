package ChibuzorClassTask;

import java.util.Scanner;

public class PreciousTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int sum = 0;
        int number = 10;
        for (count = 1; count <=10; count++) {
            System.out.println("Enter a number: ");
             number = input.nextInt();
            if (number % 3 == 0){
                sum +=number;
            }
        }
        System.out.println("The sum of number is: "+ sum);
    }
}
