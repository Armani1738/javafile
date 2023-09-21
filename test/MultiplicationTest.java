import org.junit.jupiter.api.Test;
import tdd.Multiplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    public void testMultiplication() {
        int multiply = Multiplication.multiplication(2,-0);
        assertEquals(0, multiply );
    }
}