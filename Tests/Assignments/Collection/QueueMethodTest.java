package Assignments.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueMethodTest {
    private QueueMethod queue;

    @BeforeEach
    void setUp() {
        queue = new QueueMethod();
    }

    @Test
    public void testThat_queueMethod_IsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThat_queueMethod_IsNotEmpty() {
        queue.offer("firstElement");
        assertFalse(queue.isEmpty());
    }
}

