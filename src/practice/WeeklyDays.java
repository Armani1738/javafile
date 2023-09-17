package practice;

import java.util.Scanner;

public class WeeklyDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = scanner.nextInt();
        switch (day) {
            case 0->{
                System.out.println("Enter the number of days elapsed since today: ");
                int futureNumber = scanner.nextInt();
                switch (futureNumber) {
                    case 0 -> System.out.println("Today is still sunday: ");
                    case 1 -> System.out.println("Today is sunday and future is monday: ");
                    case 2 -> System.out.println("Today is sunday and future is tuesday");
                    case 3 -> System.out.println("Today is sunday and future is wednesday");
                    case 4 -> System.out.println("Today is sunday and future is thursday");
                    case 5 -> System.out.println("Today is sunday and future is friday");
                    case 6 -> System.out.println("Today is sunday and future is saturday");
                    default -> System.out.println("Wrong input");
                }
                }
            case 1-> {
                System.out.println("Enter the number of days elapsed since today: ");
                int futureNumber1 = scanner.nextInt();
                switch (futureNumber1) {
                    case 1 -> System.out.println("today is still monday");
                    case 2 -> System.out.println("today is monday and future is tuesday");
                    case 3 -> System.out.println("today is monday and future is wednesday");
                    case 4 -> System.out.println("today is monday and future is thursday");
                    case 5 -> System.out.println("today is monday and future is friday");
                    case 6 -> System.out.println("today is monday and future is saturday");
                    case 0 -> System.out.println("today is monday and future is sunday");
                    default -> System.out.println("Wrong input");
                }
            }
            case 2-> {
                System.out.println("Enter the number of days elapsed since today: ");
                int futureNumber2 = scanner.nextInt();
                switch (futureNumber2) {
                    case 2 -> System.out.println("today is still tuesday");
                    case 3 -> System.out.println("today is s tuesday and future is wednesday");
                    case 4 -> System.out.println("today is s tuesday and future is thursday");
                    case 5 -> System.out.println("today is s tuesday and future is friday");
                    case 6 -> System.out.println("today is s tuesday and future is saturday");
                    case 0 -> System.out.println("today is s tuesday and future is sunday");
                    case 1 -> System.out.println("today is s tuesday and future is monday");
                    default -> System.out.println("Wrong input");
                }
            }
            case 3-> {
                System.out.println("Enter the number of days elapsed since today: ");
                int futureNumber3 = scanner.nextInt();
                switch (futureNumber3) {
                    case 3 -> System.out.println("today is still wednesday");
                    case 4 -> System.out.println("today is wednesday and the future is thursday");
                    case 5 -> System.out.println("today is wednesday and the future is friday");
                    case 6 -> System.out.println("today is wednesday and the future is saturday");
                    case 0 -> System.out.println("today is wednesday and the future is sunday");
                    case 1 -> System.out.println("today is wednesday and the future is monday");
                    case 2 -> System.out.println("today is wednesday and the future is tuesday");
                    default -> System.out.println("Wrong input");
                }
            }
            case 4->{
                System.out.println("Enter the number of days elapsed since today: ");
                int futureNumber4 = scanner.nextInt();
                switch (futureNumber4) {
                    case 4 -> System.out.println("today is still thursday");
                    case 5 -> System.out.println("today is thursday and future is friday");
                    case 6 -> System.out.println("today is thursday and future is saturday");
                    case 0 -> System.out.println("today is thursday and future is sunday");
                    case 1 -> System.out.println("today is thursday and future is monday");
                    case 2 -> System.out.println("today is thursday and future is tuesday");
                    case 3 -> System.out.println("today is thursday and future is wednesday");
                    default -> System.out.println("Wrong input");
                }
                }
            case 5-> {
                System.out.println("Enter the number of days elapsed since today");
                int futureNumber5 = scanner.nextInt();
                switch (futureNumber5) {
                    case 5 -> System.out.println("today is still friday");
                    case 6 -> System.out.println("today is friday and future is saturday");
                    case 0 -> System.out.println("today is friday and future is sunday");
                    case 1 -> System.out.println("today is friday and future is monday");
                    case 2 -> System.out.println("today is friday and future is tuesday");
                    case 3 -> System.out.println("today is friday and future is wednesday");
                    case 4 -> System.out.println("today is friday and future is thursday");
                    default -> System.out.println("Wrong input");
                }
            }
            case 6->{
                System.out.println("Enter the number of days elapsed since today");
                int futureNumber6 = scanner.nextInt();
                switch (futureNumber6) {
                    case 6:
                        System.out.println("today is still saturday");
                        break;
                    case 0:
                        System.out.println("today is saturday and future is sunday");
                        break;
                    case 1:
                        System.out.println("today is saturday and future is monday");
                        break;
                    case 2:
                        System.out.println("today is saturday and future is tuesday");
                        break;
                    case 3:
                        System.out.println("today is saturday and future is wednesday");
                        break;
                    case 4:
                        System.out.println("today is saturday and future is thursday");
                        break;
                    case 5:
                        System.out.println("today is saturday and future is friday");
                }
                }
        }
    }
}