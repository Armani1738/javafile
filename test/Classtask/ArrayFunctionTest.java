package Classtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunctionTest {
    @Test
    public void testReturnInt(){
        String[] input = {"ABC21F", "13CPZ", "A1L"};
        int totalCount = ArrayFunction.stringNumber(input);
        assertEquals(5, totalCount);
    }
}