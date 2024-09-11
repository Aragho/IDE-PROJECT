package carmodel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testThatTheCarFunctionality(){
        Car car = new Car("toyota", "1998", 20_000 );
        assertEquals("toyota", car.getModel());
        assertEquals("1998", car.getYear());
        assertEquals(20_000, car.getPrice());
    }
    @Test
    public void testThatThePriceIsPositive(){
        Car car = new Car("toyota", "1998", 20_000 );
        assertEquals(20_000, car.getPrice());
    }
    @Test
    public void testThatThePriceIsNegative(){
        Car car = new Car("toyota", "1998", 20_000 );
        assertEquals(20_000, car.getPrice());
        car.setPrice(-10_000);
        assertEquals(0, car.getPrice());
    }
    @Test
    public void testThatApplyDiscount(){
        Car car1 = new Car("toyota", "1998", 20_000 );
        car1.setPrice(20_000);
        car1.applyDiscount(5);
        assertEquals(19000, car1.getPrice());
        Car car2 = new Car("toyota", "1998", 20_000 );
        car2.setPrice(10_000);
        car2.applyDiscount(7);
        assertEquals(9300, car2.getPrice());
    }

}
