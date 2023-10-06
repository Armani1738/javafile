package practice;

import java.util.Arrays;

public class Duplicate {
    public int[] remove(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        int length = countUniqueValues(numbers);
        numbers = stripArrays(numbers, length);
        return numbers;
    }


   private int[] stripArrays(int[] numbers, int length){
        int[] array = new int[length];
        int count = 0;
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] != 0){
               array[count] = numbers[i];
               count++;
           }
       }

       return array;
   }













    private int countUniqueValues(int[] numbers){
        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){
                length++;
            }
        }
        return length;
    }
}



