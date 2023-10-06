package practice;

public class ShapeLoop {
    public static void main(String[] args) {
        int number = 5;
        for (int count = 0; count <=number ; count++) {
            for (int index = 0; index <=count ; index++) {
                System.out.print("*");
            }
            for (int k = 0; k <number; k++) {
                for (int j = k; j <=count; j++) {
                    System.out.print("#");

                }
                
            }
            System.out.println();
        }
    }
}
