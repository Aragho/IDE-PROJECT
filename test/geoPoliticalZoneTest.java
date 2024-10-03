import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class geoPoliticalZoneTest {
    GeoPoliticalZone geoPoliticalZone;
    @Test
    public void testThatGeoPoliticalZoneIsCreated() {
        GeoPoliticalZone geoPoliticalZone;
    }
    @Test
    public void testThatTheFirstRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.SOUTHEAST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());


    }
    @Test
    public void testThatTheSecondRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.NORTHEAST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());
    }
    @Test
    public void testThatTheThirdRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.NORTHWEST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());
    }
    @Test
    public void testThatTheFourthRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.SOUTHWEST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());
    }
    @Test
    public void testThatTheFifthRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.NORTHEAST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());
    }
    @Test
    public void testThatTheSixthRegionExist() {
        geoPoliticalZone = GeoPoliticalZone.SOUTHEAST;
        String expected = (geoPoliticalZone.getDescription());
        assertEquals(expected, geoPoliticalZone.getDescription());
    }

}
