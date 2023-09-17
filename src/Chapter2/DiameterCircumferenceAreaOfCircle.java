package Chapter2;


import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius  = input.nextDouble();
        double diameter = 2 * radius;
        double circumference = 2 * (22/7) * radius;
        double area = (22/7) * radius * radius;
        System.out.printf("The diameter is :%.3f" ,diameter);
        System.out.printf("\n The circumference is: %.3f", circumference);
        System.out.printf("\n The area is: %.3f", area);
    }
}
