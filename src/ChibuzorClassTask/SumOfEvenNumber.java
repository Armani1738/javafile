package ChibuzorClassTask;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int count;
        int sum = 0;
        for (count = 0; count <=10 ; count+=2) {
            sum +=count;
        }
        System.out.println("Sum of even numbers are " + sum);
    }
}
