public class Citizen {

	private String name;

	private double yearlyEarnings;


	public void setName(String citizenEarnings) {
		name = citizenName;

	}

	public void setEarnings(double citizenEarnings) {
		yearlyEarnings = citizenEarnings;
	}

	public double getYearlyIncomeTax() {
		TaxCalculator calculator = new TaxCalulator();
		double tax = calculator.calculateTax(yearlyEarnings);
		return tax; 

	}


} 
