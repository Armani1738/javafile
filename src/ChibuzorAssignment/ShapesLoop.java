package ChibuzorAssignment;

public class ShapesLoop {
    public static void main(String[] args) {
       int number = 5;
        int range = 0;
        for (int row = 0; row < number; row++) {
            System.out.println();
            for (int column = 0; column < row +1; column++) {
                System.out.print("* ");
                }
                }
        for ( int row = 0; row < number; row++) {
            System.out.println();
            for (int column = 0; column < 3 - row +1; column++) {
                System.out.print("* ");
            }

        }


            }

            }



