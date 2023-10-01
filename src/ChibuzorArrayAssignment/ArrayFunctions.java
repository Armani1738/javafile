package ChibuzorArrayAssignment;

import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] integer = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(odd(integer)));
    }
    public static int largest(int[] score) {
//        int[] figure = {2,4,5,9,3};
        int largest = 0;
        for (int numbers = 1; numbers <score.length; numbers++) {
            if (score[numbers]> largest){
                largest= score[numbers];
            }
        }
        return largest;
    }
    public static int[] reverse(int[] array) {
        int maxNumber = array.length - 1;
        int number = 0;
        int [] reverse = new int[array.length];
        for (int count = maxNumber; count >= 0; count--) {
            reverse[number] = array[count];
            number++;
        }
        return reverse;
    }
    public static int[] odd(int[] Number){
        int []odd = new int [Number.length/2];
        int oddNumber = 0;
        for (int count = 1; count <= Number.length ; count+=2) {
            odd[oddNumber] = Number[count];
                oddNumber++;
            }
        return odd;
        }

    }


