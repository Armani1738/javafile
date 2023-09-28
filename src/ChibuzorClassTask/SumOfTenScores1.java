package ChibuzorClassTask;

import java.util.Scanner;

public class SumOfTenScores1 {
    public static void main(String[] args) {
        int count;
        int sum = 0;
        for (count = 1; count <= 10; count++) {
            sum+=count;
        }
        System.out.printf("The Sum of the numbers are %d ", sum);

    }
}
