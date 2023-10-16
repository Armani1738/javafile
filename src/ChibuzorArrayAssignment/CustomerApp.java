package ChibuzorArrayAssignment;

import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer number: ");
        String customer = input.nextLine();
        while (!customer.matches("\\d+")){
            System.out.println("Invalid input\nEnter valid number: ");
            customer = input.nextLine();
        }
        int number = Integer.parseInt(customer);
        System.out.println("Enter number of product: ");
        String product = input.nextLine();
        while (product.matches("\\d+")){
            System.out.println("invalid input\nEnter valid number: ");
            product = input.nextLine();
        }
        int productList = Integer.parseInt(product);
        String[][] salesRecord = new String[number][productList];
        int[][] receivingRecord = new int[number][productList];
        for (int count = 0; count < number; count++) {
            System.out.println("customer" + (count + 1) + "item price is: " + "\n");
            for (int counts = 0; counts < productList; counts++) {
                System.out.println("item" + (counts + 1) + ": ");
                salesRecord[count][counts] = input.nextLine();
                while (!salesRecord[count][counts].matches("\\d+")){
                    System.out.println("invalid input\nEnter valid number: ");
                    salesRecord[count][counts] = input.nextLine();
                }
                receivingRecord[count][counts] = Integer.parseInt(salesRecord[count][counts]);
            }
            System.out.printf("%-15s", "");
            for (int columns = 0; columns < productList; columns++) {
                System.out.printf("%16s", "item" + (columns + 1));
            }
            System.out.println();
        }
        for (int count = 0; count < salesRecord.length; count++) {
            System.out.printf("%-16s", "customer" + (count + 1));
            for (int index = 0; index < salesRecord.length; index++) {
                System.out.printf("%-15s", (receivingRecord[count][index]));

            }
            System.out.println();

        }
    }
}
