package practice;

public class FirstNumber {
    public static void main(String[] args) {
        SumDigit(234);


    }

    public static int SumDigit(int number) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int total =0 ;
        int count;
        firstNumber = number % 10;
        int reminder = number / 10;
        secondNumber = reminder % 10;
        thirdNumber = number % 10;
        int sum = firstNumber + secondNumber + thirdNumber;
        total = total + sum;
        System.out.println(total);
        return total;
    }

}
