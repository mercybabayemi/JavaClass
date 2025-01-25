import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PangramCheckerTest{

	@Test
	public void CheckThatCharacterReturnsCorrectValue(){

		//given
		PangramChecker pangramChecker = new PangramChecker();

		//action
		String user_input = "The quick brown fox jumps over the lazy dog";
		String femi = "qwertyuiopasdfhjklzxcvbnm";
		boolean checkPanagram = pangramChecker.isCharacterPresent(femi);	

		//check
		boolean expected = false;
		assertEquals(expected,checkPanagram);
	}
}