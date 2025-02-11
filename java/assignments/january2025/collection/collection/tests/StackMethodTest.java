import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackMethodTest {

    private StackMethod<String> stack;

    @BeforeEach
    void setUp() {
        stack = new StackMethod<>();
    }

    @Test
    public void testThat_stackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThat_stackPushNewElementTOTop() {
        stack.push("Item");
        stack.push("Item1");
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());
    }

    @Test
    public void testThat_stackPopElementFromTop() {
        stack.push("Item");
        stack.push("Item1");
        stack.push("Item2");
        assertEquals(3, stack.size());
        Object returnedValue = stack.pop();
        assertEquals("Item2", returnedValue);
        assertEquals(2, stack.size());
    }

    @Test
    public void testThat_stackPeepReturnsElementAtTopWithoutRemovingIt() {
        stack.push("Item");
        stack.push("Item1");
        stack.push("Item2");
        assertEquals(3, stack.size());
        Object returnedValue = stack.peek();
        assertEquals("Item2", returnedValue);
        assertEquals(3, stack.size());
    }

    @Test
    public void testThat_stackSearchReturnsThe1BasedPositionOfObject(){
        stack.push("Item");
        stack.push("Item1");
        stack.push("Item2");
        assertEquals(3, stack.size());
        stack.push("Item3");
        stack.push("Item4");
        int returnedValue = stack.search("Item2");
        assertEquals(2, returnedValue);
        assertEquals(-1, stack.search("Item5"));
        assertEquals(5, stack.size());
    }
}