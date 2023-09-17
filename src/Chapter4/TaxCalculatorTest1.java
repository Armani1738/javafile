package Chapter4;

import java.util.Scanner;

public class TaxCalculatorTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator420 calculator = new TaxCalculator420();

        System.out.println("Enter the name: ");
        String theName = scanner.nextLine();
        calculator.setCitizenname(theName);
        System.out.println("Enter the salary amount yearly: ");
        int money = scanner.nextInt();
        calculator.setSalary(money);
        scanner.nextLine();
        System.out.printf("Yearly Taxrate: %.1f%n", calculator.totalTax(calculator.getSalary()));


        System.out.println("Enter the name: ");
        String theName1 = scanner.nextLine();
        calculator.setCitizenname(theName1);
        System.out.println("Enter the salary amount yearly: ");
        int money1 = scanner.nextInt();
        calculator.setSalary(money1);
        scanner.nextLine();
        System.out.printf("Yearly Taxrate: %.1f%n", calculator.totalTax(calculator.getSalary()));


        System.out.println("Enter the name: ");
        String theName2 = scanner.nextLine();
        calculator.setCitizenname(theName2);
        System.out.println("Enter the salary amount yearly: ");
        int money2 = scanner.nextInt();
        calculator.setSalary(money2);
        scanner.nextLine();
        System.out.printf("Yearly Taxrate: %.1f%n", calculator.totalTax(calculator.getSalary()));


    }

    }
