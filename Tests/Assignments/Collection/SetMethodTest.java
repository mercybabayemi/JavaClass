package Assignments.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class SetMethodTest {
    private SetMethod<String> set;

    @BeforeEach
    void setUp() {
        set = new SetMethod<>();
    }

    @Test
    public void testThat_setIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThat_setAddXYToSet() {
        set.add("firstExample");
        set.add("secondExample");
        assertEquals(2,set.size());
    }

    @Test
    public void testThat_setAddXYToSetWhenEmpty() {
        assertTrue(set.isEmpty());
        set.add("firstExample");
        set.add("secondExample");
        assertEquals(2,set.size());
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThat_setThrowsExceptionWhenDuplicatesAreFound() {
        set.add("firstExample");
        set.add("secondExample");
        set.add("thirdExample");
        set.add("fourthExample");
        assertThrows(InputMismatchException.class, () -> set.add("firstExample"));
    }

    @Test
    public void testThat_setAddNoDuplicatesAndSizeisTheSame() {
        set.add("firstExample");
        set.add("secondExample");
        set.add("thirdExample");
        set.add("fourthExample");
        assertThrows(InputMismatchException.class, () -> set.add("firstExample"));
        assertEquals(4,set.size());
    }

    @Test
    public void testThat_setAddDoesNotAddNull() {
        assertThrows(NullPointerException.class, () -> set.add(null));
    }

    @Test
    public void testThat_setRemoveXFromSet() {
        set.add("firstExample");
        set.add("secondExample");
        set.add("thirdExample");
        set.remove("secondExample");
        assertEquals(2,set.size());
    }

    @Test
    public void testThat_setDoesNotRemoveWhenEmpty() {
        assertTrue(set.isEmpty());
        assertThrows(InputMismatchException.class, () -> set.remove("example"));
    }

    @Test
    public void testThat_setRemoveThrowsExceptionWhenElementDoesNotExist() {
        set.add("firstExample");
        set.add("secondExample");
        assertThrows(InputMismatchException.class, () -> set.remove("example"));
    }

    @Test
    public void testThat_setClears() {
        set.add("firstExample");
        set.add("secondExample");
        set.add("thirdExample");
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0,set.size());
    }

    @Test
    public void testThat_setContainsXFromSet() {
        set.add("firstExample");
        set.add("secondExample");
        assertTrue(set.contains("firstExample"));
    }

    @Test
    public void testThat_setDoesNotContainsX() {
        set.add("firstExample");
        set.add("secondExample");
        assertFalse(set.contains("thirdExample"));

    }
}