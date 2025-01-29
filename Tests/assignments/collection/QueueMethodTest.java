package Assignments.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueMethodTest {
    private QueueMethod<String> queue;

    @BeforeEach
    void setUp() {
        queue = new QueueMethod<>();
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

    @Test
    public void testThat_queueMethod_IsFullAndCantAddElement() {
        queue.offer("firstElement");
        queue.offer("secondElement");
        queue.offer("thirdElement");
        assertEquals(3, queue.size());
        assertFalse(queue.offer("fourthElement"));
        assertEquals(3, queue.size());
    }

    @Test
    public void testThat_queuePeek_RetrieveHeadWithoutRemovingIt() {
        queue.offer("firstElement");
        queue.offer("secondElement");
        assertEquals("firstElement", queue.peek());
    }

    @Test
    public void testThat_queuePoll_RetrieveHeadAndRemovesIt() {
        queue.offer("firstElement");
        queue.offer("secondElement");
        assertEquals("firstElement", queue.poll());
        assertEquals(1, queue.size());
    }

    @Test
    public void testThat_queuePoll_ReturnsNullIfQueueIsEmpty() {
        assertNull(queue.poll());
    }

    @Test
    public void testThat_queueRemove_ThrowsExceptionIfQueueIsEmpty() {
        assertNull(queue.remove());
    }

    @Test
    public void testThat_queueRemove_RemovesHead() {
        queue.offer("firstElement");
        queue.offer("secondElement");
        queue.remove();
        assertEquals("secondElement", queue.peek());
        queue.offer("thirdElement");
        assertEquals(2, queue.size());
    }

    @Test
    public void testThat_queueElement_RetrievesHeadWithoutRemovingIt() {
        queue.offer("firstElement");
        queue.offer("secondElement");
        assertEquals("firstElement", queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testThat_queueElement_throwsExceptionIfQueueIsEmpty() {
        assertNull(queue.element());
    }
}

