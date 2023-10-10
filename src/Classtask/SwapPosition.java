package Classtask;

import java.util.Arrays;

public class SwapPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swap(new int[]{1,2,3,4,5},2,1)));
    }
    public static int[] swap(int[] number, int firstNumber, int secondNumber) {
         number[firstNumber] = number[firstNumber] + number[secondNumber];
        number[secondNumber] = number[firstNumber] - number[secondNumber];
        number[firstNumber] = number[firstNumber] - number[secondNumber];
        return number;
    }
}

