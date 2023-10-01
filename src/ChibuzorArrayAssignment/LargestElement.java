package ChibuzorArrayAssignment;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,9,3};
        System.out.println(largest(numbers));
    }
    public static int largest(int[] score) {
        int[] number = {2,4,5,9,3};
        int largest = 0;
        int count = 0;
        for (count = 1; count <score.length; count++) {
            if (score[count]> largest){
                largest= score[count];
            }
        }
        return largest;
    }
}