import java.util.Scanner;

public class CountPrint {
    public static void main(String[] args) {

        int sum = 0;
        int count = 1;
        while (count <= 1000) {
            count = sum + count;
            count += 1;
            System.out.print(count + "\n");


        }
    }
}
