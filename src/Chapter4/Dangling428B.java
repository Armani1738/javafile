package Chapter4;

public class Dangling428B {
    public static void main(String[] args) {
        int x = 11;
        int y = 9;
            if (x < 11) {
                if (y > 9) ;
            System.out.println("****");
        } else {
            System.out.println("$$$$");
            System.out.println("####");
        }
    }
}
