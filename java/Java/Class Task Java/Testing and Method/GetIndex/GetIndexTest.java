import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetIndexTest {
    @Test
    public void testGetIndexAvailable(){
        int[] input = {12,17,24,32,14};
        int search = 24;
        String expected = "2";
        String actual = GetIndex.getIndexAvailable(input, search);
        assertEquals(expected, actual);

        expected = "not found";
        actual = GetIndex.getIndexAvailable(input, 54);
        assertEquals(expected, actual);
    }

}