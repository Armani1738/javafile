package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean option = true;


        ArrayList<String> customerList = new ArrayList<>();
        ArrayList<String> productList = new ArrayList<>();
        ArrayList<String> quantityList = new ArrayList<>();
        ArrayList<String> unitList = new ArrayList<>();

        System.out.println("What is the customer's name: ");
        String customer = input.nextLine();
        customerList.add(customer);

        System.out.println("what did the user buy?: ");
        String product = input.nextLine();
        productList.add(product);
        System.out.println("How many pieces?: ");
        String quantity = input.nextLine();
        quantityList.add(quantity);
        System.out.println("How much per unit?: ");
        String unit = input.nextLine();
        unitList.add(unit);

        System.out.println("Add more items?: ");
        String answer = input.nextLine();
        String convert = answer.toLowerCase();
        if (convert.equals("no")) {
            option = false;

            System.out.println(customerList);
            System.out.println(productList);
            System.out.println(quantityList);
            System.out.println(unitList);
        }
    }
}