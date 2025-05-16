import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class HcfTest {
    private Hcf testHcf;

    @BeforeEach
    public void setUp() {
        testHcf = new Hcf();
    }

    @Test
    public void testThatMethodThrowsErrorWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, testHcf::getHcf, "Numbers cannot be null or empty");
    }

    @Test
    public void testThatGivenOneNumberMethodReturnsTheHighestHcf() {
        int actualHcf = testHcf.getHcf(5);
        int expectedHcf = 5;
        assertEquals(expectedHcf, actualHcf);
    }

    @Test
    public void testThatGivenTwoNumbersMethodReturnsTheHighestHcf() {
        int actualHcf = testHcf.getHcf(20,15);
        int expectedHcf = 5;
        assertEquals(expectedHcf, actualHcf);
    }

    @Test
    public void testThatGivenThreeNumbersOrMoreMethodReturnsTheHighestHcf() {
        int actualHcf = testHcf.getHcf(10,20,50);
        int expectedHcf = 10;
        assertEquals(expectedHcf, actualHcf);
    }
}