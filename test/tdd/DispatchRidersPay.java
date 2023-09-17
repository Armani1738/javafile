package tdd;

import ChibuzorAssignment.DispatchRider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DispatchRidersPay {

    @Test
    public void testDispatchridersParcel(){
        //when
        int basepay =  DispatchRider.parcel(61);
        //expected;
        assertEquals(20250, basepay);
    }
}
