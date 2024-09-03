package airconditioner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AirConditionerTest {
    @Test
    public void testToOnAirConditioner(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.setOn());
    }
    @Test
    public void testToOffAirConditioner(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.setOff());
    }
    @Test
    public void testIncreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.setOn());
        airConditioner.increaseTemperature(2);
        assertEquals(18,airConditioner.getTemperature());
    }
    @Test
    public void testDecreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.setOn());
        airConditioner.increaseTemperature(1);
        assertEquals(17,airConditioner.getTemperature());
        airConditioner.decreaseTemperature(6);
        assertEquals(16,airConditioner.getTemperature());
    }



}
