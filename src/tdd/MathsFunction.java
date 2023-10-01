package tdd;

public class MathsFunction {

    public static boolean evenOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
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
        if (factor <= 2) {
            return prime;
        } else {
            return notPrime;
        }
    }

    public static int subtract(int firstNumber, int secondNumber) {
        int positive = firstNumber - secondNumber;
        int negative = (-firstNumber) - (-secondNumber);
        if (firstNumber > secondNumber) {
            return positive;
        } else {
            return negative;
        }
    }

    public static double divide(int firstNumber, int secondNumber) {
        double quotient = (double) firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0;
        } else {
            return quotient;
        }
    }

    public static int factor(int number) {
        int factor = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                factor++;
            }
        }
        return factor;
    }

    public static boolean square(int number) {
        boolean squarenumber = true;
        int square = 1;
        int counter = 0;
        for (int count = 0; count <= number; count++) {
            if (count * count == number) {
                counter++;
            }
        }
        if (counter == 1) {
            return squarenumber;
        }
        return squarenumber;
    }

    public static boolean palindrome(int numbers) {
        boolean numberchange = true;
        int reverse = 0;
        int turnNumber = numbers;
        while (turnNumber != 0) {
            int number = turnNumber % 10;
            reverse = reverse * 18 + number;
            turnNumber /= 10;
        }
        if (turnNumber == reverse) {
            return numberchange;
        }
        return numberchange;
    }

    public static int factorial(int number) {
        int factorial = 1;
        int count = 1;
        for (count = 1; count <= number; count++) {
            factorial = factorial * count;
        }
        return factorial;
    }
}


