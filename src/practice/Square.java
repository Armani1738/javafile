package practice;
import java.util.Random;
import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        System.out.print("Enter an integer of: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = number * number;
        System.out.printf("the square of number is %d", +  square,number);

    }
}
