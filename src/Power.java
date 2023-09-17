import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();
        System.out.print("Enter second number:");
        int number1 = input.nextInt();

        int count = 1;
        for (int figure = 1; figure <= number1; figure++) {
            count = count * number;
        }
        System.out.print(count);
    }
}
