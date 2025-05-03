

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MissingNumbersTest {
    private MissingNumbers missingNumbers;

    @BeforeEach
    public void setUp() {
        missingNumbers = new MissingNumbers();
    }

    @Test
    public void testThat_givenAStringOfNumbers_valueReturnsMissingNumber() {
        int expected = 5;
        int actual = missingNumbers.getMissingNumber("1,2,3,4,6");
        assertEquals(expected,actual);
    }

    @Test
    public void testThat_givenAStringOfNumbers_valueReturnsAdditionOfMissingNumbers() {
        int expected = 10;
        int actual = missingNumbers.getMissingNumber("1,2,3,5,7,8");
        assertEquals(expected, actual);
    }

    @Test
    public void testThat_givenAStringOfAlphabetsAndNumbers_methodThrowsAnException(){
        assertThrows(IllegalArgumentException.class, () -> missingNumbers.getMissingNumber("1,3,d,5"));
    }

    @Test
    public void testThat_givenANegativeValueAndPositiveValue_methodReturnsCorrectValue(){
        int expected = -26;
        int actual = missingNumbers.getMissingNumber("-12,5,10");
        assertEquals(expected,actual);
    }

    @Test
    public void testThat_givenOnlyNegativeNumbers_methodReturnsCorrectValue() {
        int expected = -2;
        int actual = missingNumbers.getMissingNumber("-5,-4,-3,-1");
        assertEquals(expected, actual);
    }

    @Test
    public void testThat_givenOnlyPositiveNumbers_methodReturnsZero() {
        int expected = 0;
        int actual = missingNumbers.getMissingNumber("1,2,3,4");
        assertEquals(expected, actual);
    }

    @Test
    public void testThat_givenEmptyString_methodThrowsAnException() {
        assertThrows(IllegalArgumentException.class, () -> missingNumbers.getMissingNumber(""));
    }
}