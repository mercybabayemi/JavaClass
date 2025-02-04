import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodTest {
    private ArrayMethod<Integer> intArray;
    private ArrayMethod<String> array;

    @BeforeEach
    public void setUp() {
        array = new ArrayMethod<>();
    }

    @Test
    public void testThat_arrayIsEmpty() {
        assertTrue(array.isEmpty());
    }

    @Test
    public void testThat_arrayAddXToArray() {
        assertTrue(array.isEmpty());
        array.add("firstExample");
        assertEquals(1, array.size());
        assertEquals("firstExample", array.get(0));
    }

    @Test
    public void testThat_arrayIsNotEmptyAfterArrayAddXToList() {
        array.add("firstExample");
        assertFalse(array.isEmpty());
    }

    @Test
    public void testThat_arrayHandleNullExceptionInAddMethod() {
        assertThrows(NullPointerException.class, () -> array.add(null));
    }

    @Test
    public void testThat_arrayHandleNullExceptionInAddAtIndexMethod() {
        array.add("firstExample");
        array.add("secondExample");
        assertThrows(NullPointerException.class, () -> array.add(1, null));
    }

    @Test
    public void testThat_arrayAddXAtIndex() {
        array.add("firstExample");
        array.add("secondExample");
        assertFalse(array.isEmpty());
        assertEquals(2,array.size());
        assertThrows(IndexOutOfBoundsException.class, () -> array.add(1, "replacementExample"));
    }

    @Test
    public void testThat_arrayAddAtIndexThrowsExceptionWhenIndexIsOutOfBound(){
        array.add("firstExample");
        array.add("secondExample");
        assertThrows(IndexOutOfBoundsException.class, () -> array.add(2, "replacementExample"));
    }

    @Test
    public void testThat_arrayThrowsExceptionWhenArrayIsFullDuringAdd() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertTrue(array.isFull());
        assertThrows(IllegalStateException.class, () -> array.add("replacementExample"));
    }

    @Test
    public void testThat_arrayThrowsExceptionWhenArrayIsFullDuringAddWithIndex() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertTrue(array.isFull());
        assertEquals(3, array.size());
        assertThrows(IllegalStateException.class, () -> array.add(2, "replacementExample"));
    }

    @Test
    public void testThat_arrayGetMethodReturnsCorrectValue() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertEquals("firstExample", array.get(0));
        assertEquals("secondExample", array.get(1));
    }

    @Test
    public void testThat_arrayGetMethodThrowsExceptionWhenArrayIsEmpty() {
        array.isEmpty();
        assertThrows(IndexOutOfBoundsException.class, () -> array.get(0));
    }

    @Test
    public void testThat_arrayGetMethodThrowsExceptionWhenArgumentDoesNotExist() {
        array.add("firstExample");
        array.add("secondExample");
        assertThrows(IndexOutOfBoundsException.class, () -> array.get(2));
    }

    @Test
    public void testThat_arraySetXAtIndex() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        array.set(1,"setExample");
        assertEquals("setExample",array.get(1));
        assertEquals(3 , array.size());
    }

    @Test
    public void testThat_arraySetXAtIndexThrowsExceptionWhenIndexIsOutOfBound() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertThrows(IndexOutOfBoundsException.class, () -> array.set(3, "setExample"));
    }

    @Test
    public void testThat_arrayContainsXElement() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertTrue(array.contains("secondExample"));
    }

    @Test
    public void testThat_arrayDoesNotContainsXElement() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertFalse(array.contains("fourthExample"));
    }

    @Test
    public void testThat_arrayRemoveElement() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertEquals(3, array.size());
        array.remove("thirdExample");
        assertEquals(2, array.size());
        assertEquals("secondExample", array.get(1));
    }

    @Test
    public void testThat_arrayRemoveMethodDisplaysErrorMessageWhenElementDoesNotExist() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertThrows(InputMismatchException.class,()-> array.remove("example"));
    }

    @Test
    public void testThat_arrayRemoveMethodThrowsExceptionOnRemoveMethodEmptyArray() {
        assertTrue(array.isEmpty());
        assertThrows(InputMismatchException.class,()-> array.remove("firstExample"));
    }

    @Test
    public void testThat_arrayRemoveIndexMethodThrowsExceptionOnRemoveMethodWithIndex() {
        assertTrue(array.isEmpty());
        assertThrows(IndexOutOfBoundsException.class, ()-> array.remove(1));
    }

    @Test
    public void testThat_arrayRemoveIndexMethodRemovesIndexWithInput() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        array.remove(1);
        assertEquals(2, array.size());
    }

    @Test
    public void testThat_listClearElement() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        array.clear();
        assertEquals(0, array.size());
    }

    @Test
    public void testThat_arrayIsEmptyAfterClear() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        array.clear();
        assertEquals(0, array.size());
    }

    @Test
    public void testThat_arraySizeIsCorrect() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        assertEquals(3, array.size());
    }

    @Test
    public void testThat_arrayGetReturnsCorrectValue() {
        array.add("firstExample");
        array.add("secondExample");
        Object actual = array.get(0);
        assertEquals("firstExample", actual);
    }

    @Test
    public void testThat_arraySetReturnsCorrectValue() {
        array.add("firstExample");
        array.add("secondExample");
        array.add("thirdExample");
        array.set(1,"setExample");
        assertEquals("setExample",array.get(1));
    }

    @Test
    public void testThat_arrayReturnCorrectLength() {
        array.add("firstExample");
        array.add("secondExample");
        assertEquals(2, array.size());
    }


}