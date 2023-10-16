package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DuplicateTest {
    @Test
    void removeDuplicates(){
        int[] numbers = {4, 9, 4, 7, 9, 1, 7};
         Duplicate duplicate = new Duplicate();
         int[] uniqueValuesArray = duplicate.remove(numbers);
         assertEquals(4,uniqueValuesArray[0]);
         assertEquals(9,uniqueValuesArray[1]);
         assertEquals(7,uniqueValuesArray[2]);
         assertEquals(1,uniqueValuesArray.length);
    }

    }



