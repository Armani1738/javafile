package ArrayPractice;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int count = 0; count < 10; count++) {
            myArray[count] = count * 10;
        }
        for (int count = 0; count < 10; count++) {
            System.out.println("The elements of " + count + ", value is " + myArray[count]);

        }

    }

}

