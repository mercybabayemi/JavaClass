import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGeoPoliticalZones{
    @Test
    public void testEnumValues(){
        assertSame(GeoPoliticalZones.NORTH_CENTRAL, GeoPoliticalZones.valueOf("NORTH_CENTRAL"));
    }

    @Test
    public void testValuesLength(){
        assertEquals(6, GeoPoliticalZones.values().length);
    }

    @Test
    public void testPositionInOrdinal(){
        assertEquals(1, GeoPoliticalZones.NORTH_EAST.ordinal());
    }
}