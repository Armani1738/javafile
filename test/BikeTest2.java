import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest2 {

    @Test
    public void testBikeExist() {
        //Given
        Bike suzuki = new Bike(false, 0);
        //When
        assertNotNull(suzuki);
    }

    @Test
    public void testBikeCanOn() {
        //Given that i have a bike
        Bike suzuki = new Bike(false, 0);
        //The bike can be turned on
        suzuki.setSwitch();
        //It is on
        assertTrue(suzuki.setBikeSwitch());
    }

    @Test
    public void testBikeCanOff() {
        //Given that i have a bike
        Bike suzuki = new Bike(true, 0);
        //The bike can be turned off
        suzuki.setSwitch();
        //It is off
        assertFalse(suzuki.setBikeSwitch());
    }

    @Test
    public void testBikeCanAccelerate() {
        //Given that i have a bike,my bike is turned on
        Bike suzuki = new Bike(false, 0);
        suzuki.setSwitch();
        //When bike can be accelerated
        for (int b = 1; b <= 1; b++) {
            suzuki.increaseAcceleration();
        }
        //it is accelerated by
        assertEquals(1, suzuki.getAcceleration());
    }

    @Test
    public void testBikeCanIncreaseAcceleration1() {
        //Given that i have a bike,my bike is turned on
        Bike suzuki = new Bike(true, 0);
        suzuki.setSwitch();
        //When bike can accelerate
        for (int x = 0; x <= 20; x++) {
            suzuki.increaseAcceleration();
        }
        //it is accelerated by
        assertEquals(20, suzuki.getAcceleration());

    }

    @Test
    public void testBikeCanIncreaseAcceleration2() {
        //Given that i have bike,my bike is turned on
        Bike suzuki = new Bike(true, 0);
        suzuki.setBikeSwitch();
        for (int x = 21; x <= 30; x++) {
            suzuki.increaseAcceleration();
        }
        assertEquals(30, suzuki.getAcceleration());
    }

    @Test
    public void testBikeCanIncreaseAcceleration3() {
        Bike suzuki = new Bike(true, 0);
        suzuki.setBikeSwitch();
        for (int x = 31; x <= 40; x++) {
            suzuki.increaseAcceleration();
        }
        assertEquals(40, suzuki.getAcceleration());
    }
    @Test
    public void testBikeCanIncreaseAcceleration4(){
        Bike suzuki = new Bike(true ,0);
        suzuki.setBikeSwitch();
        for (int x = 40; x >= 41; x++) {
            suzuki.increaseAcceleration();
        }
        assertEquals(41,suzuki.getAcceleration());
    }
    @Test
    public void testBikeCanDecreaseAcceleration(){
        Bike suzuki = new Bike(true,0);
        suzuki.decreaseAcceleration();
        for (int x = -40; x >= -41; x++){
            suzuki.decreaseAcceleration();
            assertEquals(-4, suzuki.getAcceleration());
        }
    }
}






