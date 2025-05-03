import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testThat_whenGivenAValidArabicNumeral_returnsCorrectRomanNumeral() {
        String expected = "V";
        String actual = RomanNumeral.toRoman(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testThat_whenGivenAnInvalidInput_ThrowsAnException(){
        assertThrows(RuntimeException.class, ()-> RomanNumeral.toRoman(Integer.parseInt("")));
    }
}