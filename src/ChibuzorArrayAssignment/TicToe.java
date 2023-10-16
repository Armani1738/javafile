package ChibuzorArrayAssignment;
public class TicToe {
    public static void main(String[] args) {
        int index;
        int count;
        char[][] gameChange = {{'x','o','x'},{'x','x','o'},{'o','x','x'}};
        for (count = 0; count < gameChange.length; count++) {
            for (index = 0; index < gameChange.length; index++) {
                System.out.println(gameChange[index][count]);
            }
            System.out.println();
        }
    }
}