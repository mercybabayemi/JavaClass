import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SemiColonStoreTest{

	@Test
	public void testThatStoreNamePrintCorrectValue(){
		
		//given(pre-conditions)
		StoreType storeType = new StoreType();

		//action(functionality tested)
		boolean result = storeType.storeName();
		
		//check
		assertTrue(result);
	}
}