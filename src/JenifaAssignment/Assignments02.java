package JenifaAssignment;

import java.util.Scanner;

public class Assignments02 {
    public class Assignment02 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double radius;
            System.out.print("Enter the radius:");
            radius = input.nextDouble();
            double diameter = 2 * radius;
            double perimeter = (2 * 3.15159 * radius);
            double area = (3.14159 * radius * radius);

            System.out.printf("diameter :", diameter);
            System.out.printf("perimeter", "%.2f", perimeter);

            System.out.printf("%n area: ", "%.3f", area);


        }

    }
}
