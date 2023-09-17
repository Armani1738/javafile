import ChibuzorAssignment.Jamb;
import org.junit.jupiter.api.Test;

import static ChibuzorAssignment.Jamb.numberOfCopies;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JambTest {

    @Test
    public void testCopiesBetweenOneAndFour() {
        //When
        int copies = Jamb.numberOfCopies(3, 2000);
        //expected
        assertEquals(6000, copies);
    }
    @Test
    public void testCopiesBetweenfiveAndnine() {
        //When
        int copies = Jamb.numberOfCopies(7, 1800);
        //expected
        assertEquals(12600, copies);
    }
    @Test
    public void testCopiesBetweentenAndtwentynine() {
        //When
        int copies = Jamb.numberOfCopies(25, 1600);
        //expected
        assertEquals(40000, copies);
    }
    @Test
    public void testCopiesBetweenthirtyAndfourtynine() {
        //When
        int copies = Jamb.numberOfCopies(85, 1300);
        //expected
        assertEquals(110500, copies);
    }
    @Test
    public void testCopiesBetweenfiftyAndNintynine() {
        //When
        int copies = Jamb.numberOfCopies(150, 1200);
        //expected
        assertEquals(180000, copies);
    }
    @Test
    public void testCopiesBetweenHundredAndOneHundredAndNintyNine() {
        //When
        int copies = Jamb.numberOfCopies(450, 1100);
        //expected
        assertEquals(495000, copies);
    }
    @Test
    public void testCopiesBetweenFiveHundredAbove() {
        //When
        int copies = Jamb.numberOfCopies(520, 1000);
        //expected
        assertEquals(520000, copies);
    }
}
