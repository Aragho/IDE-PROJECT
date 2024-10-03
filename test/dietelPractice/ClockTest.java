package dietelPractice;

import dietelpractice.Clock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    @Test
    public void testTheClockFunctionality(){
        Clock clock = new Clock(13, 35, 49);
        assertEquals(13, clock.setHour(13));
        assertEquals(35, clock.setMinute(35));
        assertEquals(49, clock.setSecond(49));
    }
    @Test
    public void testTheClock_is_negative(){
        Clock clock = new Clock(-13, -35, -49);
        assertEquals(0, clock.setHour(0));
        assertEquals(0, clock.setMinute(0));
        assertEquals(0, clock.setSecond(0));
    }
}
