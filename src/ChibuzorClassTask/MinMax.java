package ChibuzorClassTask;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(minMax(numbers)));
    }

    public static int[] minMax(int[] number) {
        int[] numbers = {5, 3, 4, 1, 2};
        int largest = 0;
        int minMax = 0;
        int smallest = 0;
        int count;
        for (count = 0; count < numbers.length; count++) {
            minMax += numbers[count];
            smallest = minMax - numbers[0];
            largest = minMax - numbers[3];
        }
        System.out.println("the smallest is:"+ smallest);
        System.out.println("the smallest is:" + largest);

        return new int[]{minMax};
    }
}
