package ChibuzorArrayAssignment;

import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(odd(integer)));
    }
    public static int largest(int[] score) {
//        int[] figure = {2,4,5,9,3};
        int largest = 0;
        for (int numbers = 1; numbers < score.length; numbers++) {
            if (score[numbers] > largest) {
                largest = score[numbers];
            }
        }
        return largest;
    }
    public static int[] reverse(int[] array) {
        int maxNumber = array.length - 1;
        int number = 0;
        int[] reverse = new int[array.length];
        for (int count = maxNumber; count >= 0; count--) {
            reverse[number] = array[count];
            number++;
        }
        return reverse;
    }
    public static boolean elementOccurrance(int[] integer, int number) {
        boolean occur = true;
        for (int count = 0; count < integer.length; count++) {
            if (count == number) return occur;
        }

            return occur;
    }

//        for ({number ; integer}){
//            if (number == integer)
//                return new boolean[]{true};
//        }else
    public static int[] odd(int[] Number) {
        int[] odd = new int[Number.length / 2];
        int oddNumber = 0;
        for (int count = 1; count < Number.length; count += 2) {
            odd[oddNumber] = Number[count];
            oddNumber++;
        }
        return odd;
    }

    public static int[] even(int[] number) {
        int[] even;
        int num = 0;
        if (number.length % 2 == 1) {
            even = new int[number.length / 2 + 1];
        } else {
            even = new int[number.length / 2];
        }
        for (int count = 0; count < number.length; count = count + 2) {
            even[num] = number[count];
            num++;
        }
        return even;
    }



}

