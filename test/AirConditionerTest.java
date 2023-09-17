import ChibuzorAssignment.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatAirConditionerExist() {
        // i have an AC
        AirConditioner hisense = new AirConditioner();
        assertNotNull(hisense);

//         i turn it on it is on
//        hisense.turnOn();
    }

    @Test
    public void testThatAirConditionerCanOn() {
        // i have an ac
        AirConditioner hisense = new AirConditioner();
        // when i turn it on
        hisense.turnOn();
        // assert that it is on
        assertTrue(hisense.getAcSwitch());
    }

    @Test
    public void testAirConditionerCanOff() {
        // i have an ac
        AirConditioner hisense = new AirConditioner();
        // ac is on
        hisense.turnOn();
        //when i turn it off
        hisense.turnOff();
        // assert that it is off
        assertFalse(hisense.getAcSwitch());
    }
    @Test
    public void setTemperatureIncrease() {
        //Given i have an ac
        AirConditioner scanFrost = new AirConditioner();
        //when temperature is increased to 30
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        scanFrost.increaseTemperature();
        //confirm temperature
        assertEquals(30, scanFrost.getTemperature());
    }
    @Test
    public void setTemperatureDecrease() {
        //Given i have an ac
        AirConditioner scanFrost = new AirConditioner();
        //When temperature is decreased below 16
        scanFrost.decreaseTemperature();
        //confirm temperature
        assertEquals(16, scanFrost.getTemperature());
    }



}
