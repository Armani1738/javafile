package practice;

import java.util.Scanner;

public class NumbersWithJonathan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int day = input.nextInt();

        while (day > 6 ){

            System.out.println("Enter number 0 to 6: ");
            day= input.nextInt();
        }

        switch (day) {
            case 0 -> System.out.println("week number entered is sunday");
            case 1 -> System.out.println("week number entered is monday");
            case 2 -> System.out.println("week number entered is tuesday");
            case 3 -> System.out.println("week number entered is wednesday");
            case 4 -> System.out.println("week number entered is thursday");
            case 5 -> System.out.println("week number entered is friday");
            case 6 -> System.out.println("week number entered is saturday");

        }



//            int number = 0;
//            for (count = 1; number <= 7; count++) {

            }

        }
