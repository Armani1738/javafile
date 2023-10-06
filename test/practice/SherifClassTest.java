package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherifClassTest {
    @Test
    void checkOddPosition() {
        int[] numbers = {5,4,1,0,6,7,9};
        int result = 11;
        int actual = SherifClass.getOddSumOfArray(numbers);
        assertEquals(result, actual);
    }
    @Test
    void checkEvenPosition() {
        int[] numbers = {5,4,1,0,6,7,9};
        int result = 21;
        int actual = SherifClass.getEvenSumOfArray(numbers);
        assertEquals(result, actual);
    }
    @Test
    void sumEvenOddNumbers(){
        int[] numbers = {5,4,1,0,6,7,9};
        int result = 5;
        int actual = SherifClass.getOddSumOfArray1(numbers);
        assertEquals(result, actual);

    }
}