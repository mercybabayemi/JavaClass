import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestMultiples {

    @Test
    public void testThat_listReturnsMultiplesOfNumberThreeWhenEven(){
        Object[] objectNumbers = Multiples.findMultiples(1,10,2).toArray();
        int[] expected = Multiples.convertObjectToIntArray(objectNumbers);
        int[] actual = {2,4,6,8,10};
        assertArrayEquals(expected, actual);

        Object[] objectNumbers1 = Multiples.findMultiples(1,12,2).toArray();
        int[] expected1 = Multiples.convertObjectToIntArray(objectNumbers1);
        int[] actual1 = {2,4,6,8,10,12};
        assertArrayEquals(expected1, actual1);
    }

    @Test
    public void testThat_listReturnsMultiplesOfNumberThreeWhenOdd(){
        Object[] objectNumbers = Multiples.findMultiples(1,15,3).toArray();
        int[] expected = Multiples.convertObjectToIntArray(objectNumbers);
        int[] actual = {3,6,9,12,15};
        assertArrayEquals(expected, actual);

        Object[] objectNumbers1 = Multiples.findMultiples(1,21,3).toArray();
        int[] expected1 = Multiples.convertObjectToIntArray(objectNumbers1);
        int[] actual1 = {3,6,9,12,15,18,21};
        assertArrayEquals(expected1, actual1);
    }

//    @Test
//    public void testThat_listThrowsExceptionWhenNumberisZero(){
//        assertThrows(IllegalArgumentException.class, () => );
//    }
}
