package tdd;

public class MathsFunction {

    public static boolean evenOdd(int number) {
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean primeNumber(int number) {
        boolean prime = true;
        boolean notPrime = false;
        int count;
        int factor = 0;
        for (count = 1; count <= number; count += 1) {
            if (number % count == 0) {
                factor++;
            }
        }
        if (factor <= 2){
            return prime;
        }
        else {
            return notPrime;
        }
    }
    public static int subtract(int firstNumber, int secondNumber) {
        int positive = firstNumber - secondNumber;
        int negative = (-firstNumber) -(-secondNumber);
        if(firstNumber > secondNumber){
            return positive;
        }else {
            return negative;
        }
    }
}
