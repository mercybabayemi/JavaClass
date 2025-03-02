import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SevenSegmentDisplayTest {

    private SevenSegmentDisplay display;

    @BeforeEach
    public void setUp() {
        display = new SevenSegmentDisplay();
    }

    @Test
    public void testUserInputsNonBinaryNumbers() {
        assertThrows(IllegalArgumentException.class, () -> display.displaySegment("1234s678"));
    }

    @Test
    public void testUserInputsMoreThan8DigitNumbers() {
        assertThrows(IllegalArgumentException.class, () -> display.displaySegment("010011101"));
    }

    @Test
    public void testUserInputsLessThan8DigitNumbers() {
        assertThrows(IllegalArgumentException.class, () -> display.displaySegment("1110001"));
    }

    @Test
    public void testGiven11111100BoardIsOff() {
        display.displaySegment("11111100");
        assertFalse(display.getIsOn());
    }

    @Test
    public void testGiven11111101BoardIsOn() {
        display.displaySegment("11111101");
        assertTrue(display.getIsOn());
        display.displaySegment("11111100");
        assertFalse(display.getIsOn());
    }

    @Test
    public void testGiven11111100IsOffThenEmptyStringIsDisplayed() {
        display.displaySegment("11111100");
        assertFalse(display.getIsOn());
        char[][] expectedResult = new char[][]{
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        assertArrayEquals(expectedResult, display.displaySegment("11111100"));
    }

    @Test
    public void testGiven11111101BoardIsOnWhenDisplayedThenHashtagsRepresenting0IsDisplayed() {
        char[][] actual = display.displaySegment("11111101");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven01100001BoardIsOnWhenDisplayedThenHashtagsRepresenting1IsDisplayed() {
        char[][] actual = display.displaySegment("01100001");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {' ', ' ', ' ', ' '},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', ' '}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven11011011BoardIsOnWhenDisplayedThenHashtagsRepresenting2IsDisplayed() {
        char[][] actual = display.displaySegment("11011011");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', ' '},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven11110011BoardIsOnWhenDisplayedThenHashtagsRepresenting3IsDisplayed() {
        char[][] actual = display.displaySegment("11110011");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven01100111BoardIsOnWhenDisplayedThenHashtagsRepresenting4IsDisplayed() {
        char[][] actual = display.displaySegment("01100111");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {' ', ' ', ' ', ' '},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', ' '}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven10110111BoardIsOnWhenDisplayedThenHashtagsRepresenting5IsDisplayed() {
        char[][] actual = display.displaySegment("10110111");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', ' '},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven10111111BoardIsOnWhenDisplayedThenHashtagsRepresenting6IsDisplayed() {
        char[][] actual = display.displaySegment("10111111");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', ' '},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven11100001BoardIsOnWhenDisplayedThenHashtagsRepresenting7IsDisplayed() {
        char[][] actual = display.displaySegment("11100001");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {' ', ' ', ' ', ' '}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven11111111BoardIsOnWhenDisplayedThenHashtagsRepresenting8IsDisplayed() {
        char[][] actual = display.displaySegment("11111111");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGiven11110111BoardIsOnWhenDisplayedThenHashtagsRepresenting9IsDisplayed() {
        char[][] actual = display.displaySegment("11110111");
        assertTrue(display.getIsOn());
        char[][] expected = new char[][]{
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'},
                {' ', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }
}
