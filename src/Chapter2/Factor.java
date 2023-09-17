package Chapter2;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = inputs.nextInt();

        int factor = number * number / 5 ;
        if (number != 0 && number % 5 == 0 ){
            System.out.println("factor");
        }
        else  {
            System.out.println("not a factor");

        }

    }
}
