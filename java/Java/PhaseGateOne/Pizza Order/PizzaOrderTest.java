import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaOrderTest{

	@Test
	public void checkThatCharacterReturnsCorrectValue(){

		//given
		PizzaOrder pizzaOrder = new PizzaOrder();

		//action
		String[] user_input2 = {"Sapa size","Small money","Big boys","Odogwu"};
		int user_input1 = 1;
		String checkPizzaOrder = pizzaOrder.getPizzaType(user_input2,user_input1);	

		//check
		String expected = "Sapa size";
		assertEquals(expected,checkPizzaOrder);
	}
}