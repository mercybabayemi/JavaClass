package ClassTaskJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PositiveAndNegativeCountTest{
	
	@Test
	public void testGetIndexPositiveCount(){
		int[] input = {15,34,-1,24,-7,9};
		int expected = 4;
		int actual = PositiveAndNegativeCount.getIndexPositiveCount(input);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetIndexNegativeCount(){
		int[] input = {15,34,-1,24,-7,9};
		int expected = 2;
		int actual = PositiveAndNegativeCount.getIndexNegativeCount(input);
		assertEquals(expected,actual);
	}
}