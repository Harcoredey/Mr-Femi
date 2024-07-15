import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitizenTest {

	

	@Test
	public void testCalculateYearlyIncome() {
		Citizen citizen = new Citizen();
		citizen.setName("John Doe");
		citizen.setEarnings(30_000);

		double tax = citizen.getYearlyIncomeTax();

		assertEquals(4_500, tax);

   }

}