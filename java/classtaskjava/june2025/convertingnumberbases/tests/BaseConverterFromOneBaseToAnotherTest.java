import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseConverterFromOneBaseToAnotherTest {

    private final BaseConverterFromOneBaseToAnother baseConverterFromOneBaseToAnother = new BaseConverterFromOneBaseToAnother();

    @Test
    public void testThatGetNumberConvertedFromOneBaseToAnotherReturnsCorrectValue() {
        int actual = 23;
        int expected = baseConverterFromOneBaseToAnother.getNumberConvertedFromOneOneBaseToAnother(2, 5, 1101);
        assertEquals(actual, expected);

        int actual2 = 103;
        int expected2 = baseConverterFromOneBaseToAnother.getNumberConvertedFromOneOneBaseToAnother(3, 4, 201);
        assertEquals(actual2, expected2);
    }
}