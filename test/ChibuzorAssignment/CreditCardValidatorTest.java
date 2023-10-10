package ChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {
    @Test
    void checkCreditCardValidity(){
        String[] numbers = {"4","3","8","8","5","7","6","0","1","8","4","1","0","7","0","7", "9"};
        CreditCardValidator cc = new CreditCardValidator();
        String result = cc.cardNumber(numbers);
        assertEquals(result, "Invalid Card Length");

    }
}