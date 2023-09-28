package ChibuzorClassTask;

import java.util.Scanner;

public class divisiblescore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int number = 20;
        int factorial = 0;
        number = factorial-1;
        for (count =1; count > number; count--) {
            factorial += count;
        }
        System.out.printf("%d", factorial);
    }
}
