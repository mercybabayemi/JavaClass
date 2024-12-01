import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SemiColonStoreTest{

	@Test
	public void testMajorDisplayExist(){
		
		//given(pre-conditions)
		SemiColonStore.majorDisplay();

		//action(functionality tested)
		String expected = "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS STATE.\nTEL : 03293828343\nCashier : Oyindamola";

		//check
		assertTrue(expected);
	}
}