import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListMethodTest {
    private ArrayListMethod<String> list;

    @BeforeEach
    public void setUp() {
        list = new ArrayListMethod<>();
    }

    @Test
    public void testThat_listIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThat_listAddXToList() {
        assertTrue(list.isEmpty());
        list.add("firstExample");
        assertEquals(1, list.size());
        assertEquals("firstExample", list.get(0));
    }

    @Test
    public void testThat_listIsNotEmptyAfterListAddXToList() {
        list.add("firstExample");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThat_listHandleNullExceptionInAddMethod() {
        assertThrows(NullPointerException.class, () -> list.add(null));
    }

    @Test
    public void testThat_listHandleNullExceptionInAddAtIndexMethod() {
        list.add("firstExample");
        list.add("secondExample");
        assertThrows(NullPointerException.class, () -> list.add(1, null));
    }

    @Test
    public void testThat_listAddXAtIndex() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.add("fourthExample");
        assertFalse(list.isEmpty());
        assertEquals(4,list.size());
        list.add(1, "replacementExample");
        assertEquals("replacementExample",list.get(1));
        assertEquals(5,list.size());
    }

    @Test
    public void testThat_listAddAtIndexThrowsExceptionWhenIndexIsOutOfBound(){
        list.add("firstExample");
        list.add("secondExample");
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(2, "replacementExample"));
    }

    @Test
    public void testThat_listIncreaseCapacityWhenListIsFullDuringAdd() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertTrue(list.isFull());
        list.add("fourthExample");
        assertEquals(4,list.size());
    }

    @Test
    public void testThat_listIncreaseCapacityWhenListIsFullDuringAddWithIndex() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.add("fourthExample");
        list.add(2, "fifthExample");
        assertEquals(5,list.size());
        assertEquals("fourthExample", list.get(4));
    }

    @Test
    public void testThat_listGetMethodReturnsCorrectValue() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertEquals("firstExample", list.get(0));
        assertEquals("secondExample", list.get(1));
    }

    @Test
    public void testThat_listGetMethodThrowsExceptionWhenListIsEmpty() {
        list.isEmpty();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    public void testThat_listGetMethodThrowsExceptionWhenArgumentDoesNotExist() {
        list.add("firstExample");
        list.add("secondExample");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void testThat_listSetXAtIndex() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.add("fourthExample");
        list.set(1,"setExample");
        assertEquals("setExample",list.get(1));
        assertEquals(4 , list.size());
    }

    @Test
    public void testThat_listSetXAtIndexThrowsExceptionWhenIndexIsOutOfBound() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, "setExample"));
    }

    @Test
    public void testThat_listContainsXElement() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertTrue(list.contains("secondExample"));
    }

    @Test
    public void testThat_listDoesNotContainsXElement() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertFalse(list.contains("fourthExample"));
    }

    @Test
    public void testThat_listRemoveElement() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.add("fourthExample");
        assertEquals(4, list.size());
        list.remove("thirdExample");
        assertEquals(3, list.size());
        assertEquals("fourthExample", list.get(2));
    }

    @Test
    public void testThat_listRemoveMethodDisplaysErrorMessageWhenElementDoesNotExist() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertThrows(InputMismatchException.class,()->list.remove("example"));
    }

    @Test
    public void testThat_listRemoveMethodThrowsExceptionOnRemoveMethodEmptyList() {
        assertTrue(list.isEmpty());
        assertThrows(InputMismatchException.class,()-> list.remove("firstExample"));
    }

    @Test
    public void testThat_listClearElement() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testThat_listIsEmptyAfterClear() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testThat_listSizeIsCorrect() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        assertEquals(3, list.size());
    }

    @Test
    public void testThat_listGetReturnsCorrectValue() {
        list.add("firstExample");
        list.add("secondExample");
        Object actual = list.get(0);
        assertEquals("firstExample", actual);
    }

    @Test
    public void testThat_listSetReturnsCorrectValue() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.set(1,"setExample");
        assertEquals("setExample",list.get(1));
    }

    @Test
    public void testThat_listRemovesAllElements() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.removeAll();
        assertEquals(0, list.size());
    }

    @Test
    public void testThat_arrayRemoveIndexMethodThrowsExceptionOnRemoveMethodWithIndex() {
        assertTrue(list.isEmpty());
        assertThrows(IndexOutOfBoundsException.class, ()-> list.remove(1));
    }

    @Test
    public void testThat_arrayRemoveIndexMethodRemovesIndexWithInput() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.remove(1);
        assertEquals(2, list.size());
    }

    @Test
    public void testThat_arrayRemoveAllMethodRemoveAllInput() {
        list.add("firstExample");
        list.add("secondExample");
        list.add("thirdExample");
        list.removeAll();
        assertEquals(0, list.size());
    }


}