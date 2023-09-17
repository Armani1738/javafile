package practice;

import java.util.Scanner;

public class pythonpractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = scanner.nextInt();
        String result;
        result = (age < 18) ? "not eligible" : "eligible" ;
        System.out.println(result);
    }
}
