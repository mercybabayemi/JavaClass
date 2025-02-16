import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListMethodTest {
    public LinkedListMethod<String> linkedListMethod;

    @BeforeEach
    void setUp() {
        linkedListMethod = new LinkedListMethod<>();
    }

    @Test
    public void testThat_linkedListMethod_isEmpty() {
        assertTrue(linkedListMethod.isEmpty());
    }

    @Test
    public void testThat_linkedListMethod_addElements(){
        linkedListMethod.add("first");
        linkedListMethod.add("second");
        linkedListMethod.add("third");
        assertFalse(linkedListMethod.isEmpty());
        assertEquals(3, linkedListMethod.size());
    }

    @Test
    public void testThat_linkedListMethod_removeElements(){
        linkedListMethod.add("first");
        linkedListMethod.add("second");
        linkedListMethod.add("third");
        linkedListMethod.remove("second");
        assertEquals(2, linkedListMethod.size());
    }
}
