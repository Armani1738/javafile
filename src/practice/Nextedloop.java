package practice;

public class Nextedloop {
    public static void main(String[] args) {
        numberOfBox(5);
    }
    public static void numberOfBox(int numberOfstar) {
        for (int count = 1; count <= 5; count++) {
            star(numberOfstar);
        }
    }
    public static void star(int numberOfstar){
        for (int i = 1; i <= 5 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
}
}