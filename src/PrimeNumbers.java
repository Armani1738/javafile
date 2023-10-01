import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = input.nextInt();
        int prime =0;
        if(prime != 0 && number % 2 == 0){
            System.out.print("Not a prime");
        } else {
            System.out.print("number is a prime");

        }
    }
}
