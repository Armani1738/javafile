package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean option = false;

        ArrayList<String> itemsList = new ArrayList<>();
        ArrayList<String> quantityList = new ArrayList<>();
        ArrayList<String> unitOfProduct = new ArrayList<>();


        String convert = "yes";
        String quantity;
        System.out.println("What is the customer's name: ");
        String customer = input.nextLine();


        int counts = 0;
        while (convert.equals("yes")) {
            System.out.println("what did the user buy?: ");
            String item = input.nextLine();
            itemsList.add(item);

            System.out.println("How many pieces?: ");
            quantity = input.nextLine();
            quantityList.add(quantity);

            System.out.println("How much per unit?: ");
            String unit = input.nextLine();
            unitOfProduct.add(unit);
            counts++;

            System.out.println("Add more items?: ");
            String answer = input.nextLine();
            convert = answer.toLowerCase();
            if (convert.equals("no")) {
                System.out.println(option);
            }
        }


        System.out.println("What is the cashier's name: ");
        String cashier = input.nextLine();
        System.out.println("How much discount will customer get?: ");
        String discount = input.nextLine();
        int itemPrice;

        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.printf("""
                                SEMICOLON STORES
                                MAIN BRANCH
                                LOCATION: 312 HERBERT MACAULAY WAY, SABO, LAGOS
                                TEL: O7O18119827
                                DATE: %S
                                CASHIERS: %S
                                CUSTOMER NAME: %S
                                                    
                                ====================================================
                                    ITEM       QTY          PRICE          TOTAL(NGN)
                                ----------------------------------------------------
                                                                    """, date,cashier, customer);
        int itemsTotalPrice = 0;
        for (int count = 0; count < counts; count++) {
            String goods = itemsList.get(count);
            String pricePerUnit = unitOfProduct.get(count);
            quantity = quantityList.get(count);
            itemPrice = Integer.parseInt(quantity) * Integer.parseInt(pricePerUnit);
            itemsTotalPrice = itemsTotalPrice + itemPrice;
            System.out.printf("\t%s\t\t\t%s\t\t\t%s\t\t\t%d\n",goods, quantity, pricePerUnit, itemPrice);
        }
        double itemDiscount = (double) itemsTotalPrice * Integer.parseInt(discount) / 100;
        double vat = (double) itemsTotalPrice * (17.50 / 100);
        double billTotal = ((double)itemsTotalPrice + vat) - itemDiscount;
        System.out.printf("""
                                
                                                  sub Total:  %d
                                                   Discount:  %.2f
                                                VAT @ 17.50:  %.2f
                                ============================================
                                                 Bill Total:  %.2f
                                ============================================
                                     THIS IS NOT A RECEIPT KINDLY PAY %.2f
                     """, itemsTotalPrice, itemDiscount, vat, billTotal, billTotal);
        System.out.println("How much did the customer give to you?: ");
        String amountTender = input.nextLine();


       String balance = String.valueOf(Integer.parseInt(amountTender) - billTotal);
        System.out.printf("""
                                ===========================================================
                                SEMICOLON STORES
                                MAIN BRANCH
                                LOCATION: 312 HERBERT MACAULAY WAY, SABO, LAGOS
                                TEL: 07018119827
                                DATE: %s
                                CASHIER: %s
                                Customer Name: %S
                                ============================================================
                                ITEM        QTY          PRICE          TOTAL(NGN)
                                ------------------------------------------------------------
                """, date, cashier, customer);

        for (int index = 0; index < counts; index++) {
            String goods = itemsList.get(index);
            String pricePerUnit = unitOfProduct.get(index);
            quantity = quantityList.get(index);
            itemPrice = Integer.parseInt(quantity) * Integer.parseInt(pricePerUnit);
            itemsTotalPrice = itemsTotalPrice + itemPrice;
            System.out.printf("\t\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%d\n", goods, quantity, pricePerUnit, itemPrice);
        }
    }
}