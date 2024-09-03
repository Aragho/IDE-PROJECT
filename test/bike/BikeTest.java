package bike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testToTurnOn() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());

    }

    @Test
    public void testToTurnOff() {
        Bike bike = new Bike();
        assertFalse(bike.turnOff());
    }

    @Test
    public void testBikeToAccelerateByGearOne() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(1,15);
        assertEquals(16,bike.accelerate());
    }

    @Test
    public void testBikeToAccelerateByGearTwo() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(2,24);
        assertEquals(26,bike.accelerate());
    }
    @Test
    public void testBikeToAccelerateByGearThree() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(3,35);
        assertEquals(38,bike.accelerate());
    }
    @Test
    public void testBikeToAccelerateByGearFour() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(4,44);
        assertEquals(48,bike.accelerate());
    }
    @Test
    public void testToDecelerateByGearOne() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(1, 15);
        assertEquals(14, bike.deccelerate());
    }
    @Test
    public void testToDecelerateByGearTwo() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(2,24);
        assertEquals(22,bike.deccelerate());


    }
    @Test
    public void testToDecelerateByGearThree() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(3,35);
        assertEquals(32,bike.deccelerate());
    }
    @Test
    public void testToDecelerateByGearFour() {
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(4,44);
        assertEquals(40,bike.deccelerate());

    }
}