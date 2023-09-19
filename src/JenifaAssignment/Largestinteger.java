package JenifaAssignment;

import java.util.Scanner;

public class Largestinteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer1: ");
        int integer1 = input.nextInt();

        System.out.print("Enter integer2: ");
        int integer2 = input.nextInt();

        System.out.print("Enter integer3: ");
        int integer3 = input.nextInt();

        System.out.print("Enter integer4: ");
        int integer4 = input.nextInt();

        System.out.print("Enter integer5: ");
        int integer5 = input.nextInt();


        int interger1 = 0;
        if (integer1 > integer2 && integer1 > integer3 && interger1 > integer4 && integer1 > integer5)
            System.out.printf("the highest number is %d%n", integer1);

        int interger2 = 0;
        if (integer2 > integer1 && integer2 > integer3 && interger2 > integer4 && integer2 > integer5)
            System.out.printf("the highest number is %d%n", integer2);

        int interger3 = 0;
        if (integer3 > integer1 && integer3 > integer2 && interger3 > integer4 && integer3 > integer5)
            System.out.printf("the highest number is %d%n", integer3);

        int interger4 = 0;
        if (integer4 > integer1 && integer4 > integer2 && interger4 > integer3 && integer4 > integer5)
            System.out.printf("the highest number is %d%n", integer4);

        int interger5 = 0;
        if (integer5 > integer1 && integer5 > integer2 && interger5 > integer3 && integer5 > integer4)
            System.out.printf("the highest number is %d%n", integer5);


        if (integer1 < integer2 && integer1 < integer3 && interger1 < integer4 && integer1 < integer5)
            System.out.printf("the lowest number is %d%n", integer4);

        if (integer2 < integer1 && integer2 < integer3 && interger2 < integer4 && integer2 < integer5)
            System.out.printf("the lowest number is %d%n", integer2);

        if (integer3 < integer1 && integer3 < integer2 && interger3 < integer4 && integer3 < integer5)
            System.out.printf("the lowest number is %d%n", integer3);

        if (integer4 < integer1 && integer4 < integer2 && interger4 < integer3 && integer4 < integer5)
            System.out.printf("the lowest number is %d%n", integer4);

        if (integer5 < integer1 && integer5 < integer2 && interger5 < integer3 && integer5 < integer4)
            System.out.printf("the lowest number is %d%n", integer5);

    }
}
