import org.junit.jupiter.api.Test;
import tdd.MathsFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsFunctionTest {
    @Test
    public void testEvenOdd(){
        boolean number = MathsFunction.evenOdd(4);
        assertEquals(true,number);
    }
    @Test
    public void testPrimeNumbers(){
        boolean number = MathsFunction.primeNumber(18);
        assertEquals(false, number);
    }
    @Test
    public  void testSubtract(){
        int numbers = MathsFunction.subtract(8, 15);
        assertEquals(7, numbers);
    }
    @Test
    public void testDivide(){
        double divide = MathsFunction.divide(10,2);
        assertEquals(5, divide);
    }
    @Test
    public void testFactorial(){
        int factorial = MathsFunction.factor(15);
        assertEquals(4, factorial);

    }
    @Test
    public void testsquare(){
        boolean square = MathsFunction.square(25);
        assertEquals(true, square);
    }
    @Test
    public void palindrome(){
        boolean palindrome = MathsFunction.palindrome(5);
        assertEquals(true, palindrome);
    }
    @Test
    public void factorial(){
        int factorial = MathsFunction.factorial(15);
        assertEquals(2004310016, factorial);
    }

}
