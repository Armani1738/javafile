import org.junit.jupiter.api.Test;
import tdd.MathsFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsFunctionTest {
    @Test
    public void testEvenOdd() {
        boolean isEven = MathsFunction.evenOdd(4);
        assertEquals(true, isEven);
    }

    @Test
    public void testPrimeNumbers() {
        boolean isPrime = MathsFunction.primeNumber(18);
        assertEquals(false, isPrime);
    }

    @Test
    public void testSubtract() {
        int subtract = MathsFunction.subtract(8, 15);
        assertEquals(7, subtract);
    }

    @Test
    public void testDivide() {
        double divide = MathsFunction.divide(10, 2);
        assertEquals(5, divide);
    }

    @Test
    public void testFactorial() {
        int factorOf = MathsFunction.factor(15);
        assertEquals(4, factorOf);

    }

    @Test
    public void testsquare() {
        boolean isSquare = MathsFunction.square(25);
        assertEquals(true, isSquare);
    }

    @Test
    public void palindrome() {
        boolean isPalindrome = MathsFunction.palindrome(5);
        assertEquals(true, isPalindrome);
    }

    @Test
    public void factorial() {
        int factorialOf = MathsFunction.factorial(15);
        assertEquals(2004310016, factorialOf);
    }

}
