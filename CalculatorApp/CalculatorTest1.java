import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

	
	@Test
	public void testThatCalculatorCanDivideTwoNumbers() {
	
	//given: what you have in place for the test, for me to have add functionality of a calculator, i need to first have a calculator. (Input)

	Calculator calculator = new Calculator();

	//when: it would help you invoke the action, where you call the add functionality of the claculator (Processing)

	int result = calculator.add(4,2);

	//assert: where we do the verificiation, the result produced (Output) 

	assertEquals(2, result);



	}


}