package Chapter4;

public class Dangling427 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if (x > 5) {
            if (y > 5) {
                System.out.printf("x and y are > 5", x);
            }
        } else {
            System.out.printf("x is <= 5", y);
        }
    }
}