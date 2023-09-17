package ChibuzorAssignment;

public class CalculateSum {
    public static void main(String[] args) {
        int naturalNumber = 10;
        int sum = 0;
        for (int number = 0; number <= naturalNumber; number++){
            sum = sum + number;
            //System.out.println("initial sum "+ sum+" of "+ "number "+ number);
        }
       System.out.println("Final sum "+ sum);
    }
}
