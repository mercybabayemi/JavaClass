import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SemiColonStoreTest{

	@Test
	public void testThatStoreNamePrintCorrectValue(){
		
		//given(pre-conditions)
		Store store = new Store();

		//action(functionality tested)
		boolean result = store.storeName();
		
		//check
		assertTrue(result)
	}
}