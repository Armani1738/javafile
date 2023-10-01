import java.util.Scanner;

import static java.sql.DriverManager.println;
//import static sun.jvm.hotspot.runtime.DeadlockDetector.print;

public class ClassFactorTask {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = inputs.nextInt();
        int factor = number / 2;
        if (factor % 2 == 0) {
            System.out.println("number entered is a prime number");
        }else
            System.out.println("number entered is not a prime number");
        }
    }

   // int count = 0;
     //   for (count = 2; count <= number/2; count++) {
       //         }