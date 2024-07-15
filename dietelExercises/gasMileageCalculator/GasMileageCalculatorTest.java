import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageCalculatorTest {

	@Test
	public void testCanCalculateMilesPerGallon() {

	//given
	GasMileageCalculator calculator = new GasMileageCalculator();
	//when
	double numberOfMilesDriven = 30.00;
	double numberOfGallons = 5;
	double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);
	//assert
	assertEquals(6, milesPerGallon);



   }







}