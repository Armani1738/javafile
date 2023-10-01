import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int remainder = number % 2;
        if (remainder % 2== 0) {
            System.out.printf("number is whole %d", remainder);
        } else if (remainder != 0) {
            System.out.printf("number is odd %d", number);
        }
    }
}

