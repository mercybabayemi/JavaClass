import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GivenBaseToBaseTenFirstTest {
    GivenBaseToBaseTenFirst givenBaseToBaseTenFirst = new GivenBaseToBaseTenFirst();

    @Test
    public void testThatBaseTenConversionReturnsCorrectValue() {
        int actual = 13;
        int expected = givenBaseToBaseTenFirst.getBaseTen(1101, 2);
        assertEquals(actual, expected);
    }
}