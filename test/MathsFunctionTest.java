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
//    @Test
//    public
}
