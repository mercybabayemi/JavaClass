import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapMethodTest {

    private MapMethod<String, String> map;

    @BeforeEach
    void setUp(){
        map = new MapMethod<>();
    }

    @Test
    public void testThat_mapIsEmpty(){
        assertTrue(map.isEmpty());
    }

    @Test
    public void testThat_mapAddsKeysAndValues(){
        map.put("first", "I love neutrals");
        map.put("second", "I love reading");
        assertEquals(2, map.size());
    }

    @Test
    public void testThat_mapContainsValueReturnsValue(){
        map.put("first", "I love neutrals");
        map.put("second", "I love reading");
        assertTrue(map.containsValue("I love neutrals"));
        assertFalse(map.containsValue("I love"));
    }

    @Test
    public void testThat_mapContainsKeyReturnsCorrectValue(){
        map.put("first", "I love neutrals");
        map.put("second", "I love reading");
        assertTrue(map.containsKey("first"));
        assertFalse(map.containsKey("third"));
    }

    @Test
    public void testThat_mapGetMetodReturnsValueOfKey(){
        map.put("first", "I love neutrals");
        map.put("second", "I love reading");
        assertEquals("I love neutrals", map.get("first"));
    }

    @Test
    public void testThat_mapRemovesKeyAndValueAndReturnValue(){
        map.put("first", "I love neutrals");
        map.put("second", "I love reading");
        assertEquals("I love neutrals", map.remove("first"));
        assertNull(map.remove("yes"));
    }

    @Test
    public void testThat_mapClearsAll(){

    }
}