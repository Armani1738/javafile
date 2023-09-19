package JenifaAssignment;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();

        System.out.print("Enter height in pounds: ");
        int height = input.nextInt();

        int wei = weight * 703;
        int hei = height * height;
        int sum = wei / hei;

        System.out.printf("BMI is %d%n", sum);

    }

}




