import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BaseTenToTargetBaseTest {
    BaseTenToTargetBase target = new BaseTenToTargetBase();

    @Test
    public void testBaseTenToTargetBaseReturnsCorrectNumber() {
        int actual = 100101;
        int expected = target.getTargetBaseConversion(37, 2);
        assertEquals(actual, expected);

        int actual2 = 23;
        int expected2 = target.getTargetBaseConversion(13, 5);
        assertEquals(actual2, expected2);
    }

    @Test
    public void testBaseTenToTargetBaseReturnsCorrectNumberWithZero() {
        int actual = 0;
        int expected = target.getTargetBaseConversion(0, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void testBaseTenToTargetBaseThrowsExceptionWhenTargetBaseNumberIsLessThanTwoToTenOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> target.getTargetBaseConversion(32, -1));
    }
}
