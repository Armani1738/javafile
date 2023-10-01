import ChibuzorArrayAssignment.ArrayFunctions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayFunctionsTest {
    @Test
    void testLargestNumberExist() {
        int [] number = {2,4,12,1,3};
        int largest = 12;
        int result = ArrayFunctions.largest(number);
        assertEquals(result, largest);
    }
    @Test
    void testNumberCanReverse(){
        int[] array = {5, 9, 2, 8, 4};
        int[] result = ArrayFunctions.reverse(array);
        int [] answer = {4, 8, 2, 9, 5};
        assertArrayEquals(result, answer);
    }
    @Test
    void testNumberCanReverseLength(){
        int[] array = {10, 36, 2, 9,98, 17, 8, 22, 7, 13};
        int[] result = ArrayFunctions.reverse(array);
        int [] answer = {13, 7, 22, 8, 17, 98, 9, 2, 36, 10};
        assertArrayEquals(result, answer);
    }
    @Test
    void testArraylist(){

    }

}