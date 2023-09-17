import Chapter3.HeartRate316;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class HeartRateTest {
    @Test
    void userIsNotNull(){
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8,10,1992);
        Assertions.assertNotNull(heartRate);
    }
    @Test
    void userCanGetDOB(){
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8,10,1992);
        heartRate.setDob(3, 20, 1990);
        Assertions.assertEquals("May/20/1990", heartRate.getDob());
    }
    @Test
    void userCanGetAge(){
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8,10,1992);
        heartRate.setAge(1990);
        Assertions.assertEquals(33, heartRate.getAge());
    }
    @Test
    void calculateMaximumHeartRate(){
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8,10,1992);
        Assertions.assertEquals(189, heartRate.MaximumHeartRate());
    }
    @Test
    void calculateTagetHeartRate(){
        HeartRate316 heartRate = new HeartRate316("Armani", "Udoh", 8,10,1992);
        Assertions.assertEquals(151.2, heartRate.TargetHeartRate(80));
    }
}
