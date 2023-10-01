package ChibuzorArrayAssignment;

public class ArrayFunctions {
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

}
