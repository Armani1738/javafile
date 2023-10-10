package ChibuzorAssignment;

import java.util.Arrays;
public class CreditCardValidator {
    public static void main(String[] args) {
        //String[] cardLength = new String[16];
        cardNumber(new String[]{"4", "5", "6", "7", "8", "9", "10", "12", "13", "18", "19","20","21","22"});
    }
    public static String cardNumber(String [] array) {
        //System.out.println(Arrays.toString(array));
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
    public static String calculateValiditity(String[] cardNum) {
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
        return String.valueOf(sum);
    }

}