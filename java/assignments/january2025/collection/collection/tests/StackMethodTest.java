import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMethodTest {

    private StackMethod<String> stack;

    @BeforeEach
    void setUp() {
        stack = new StackMethod<>();
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
    }

}