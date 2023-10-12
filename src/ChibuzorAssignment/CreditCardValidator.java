package ChibuzorAssignment;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Kindly Enter Card Detail to verify: ");
        String cardNumber = input.nextLine();
        String [] cardNum = {cardNumber};
        System.out.println("*******************************************");
        System.out.println("** The card type is: "+ cardType(cardNumber));
        System.out.println("** The Credit card digit length: "+ cardNumber.length());
        System.out.println("** The Credit card Number: "+ cardNumber);
        calculateValidity(cardNum);
        System.out.println("*******************************************");
    }
    public static String cardNumber(String [] array) {
        String response = "";
            if (array.length < 13){
                response = "Invalid Card Length";
            } else if (array.length > 16) {
                response = "Invalid Card Length";
            }
            else {
              response = "Valid Card length";
            }
        return response;
    }
    public static String calculateValidity(String[] cardNum) {
        int temp;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int sum;
        for (int count = cardNum.length -2; count >= 0; count-=2) {
            temp = Integer.parseInt(cardNum[count]);
            int doublineNumbers = temp * 2;
            if (doublineNumbers >= 10){
                int first = doublineNumbers / 10 % 10;
                int second = doublineNumbers / 100 % 10;
                doublineNumbers = first + second;
                return String.valueOf(doublineNumbers);
            }
            sumOfEvenNumbers += doublineNumbers;
        }
        for (int count = cardNum.length-1; count >= 0; count--) {
            if (count % 2 != 0){
                sumOfOddNumbers += Integer.parseInt(cardNum[count]);
            }
        }
        sum = sumOfEvenNumbers + sumOfOddNumbers;
        if (sum % 10 == 0)
            System.out.println("** credit card validity status: Valid");
        else
            System.out.println("** credit card validity status: Invalid");
        return String.valueOf(sum);
    }
    public static String cardType(String cardNumber){
        int[] cardCheck = new int[cardNumber.length()];
        for (int count = 0; count < cardCheck.length; count++) {
            if (cardCheck.length >= 13 && cardCheck.length <= 16)
                cardCheck[count] = Integer.parseInt(cardNumber.substring(count, count + 1));
            if (cardCheck[0] == 4) return "Visa Card";
            if (cardCheck[0] == 5) return "MasterCard";
            if (cardCheck[0] == 3) return "American Express Card";
            if (cardCheck[0] == 6) return "Discovery Card";
        }
        return "Invalid card";

        }
    }