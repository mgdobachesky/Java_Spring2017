package payCalculatorLab;

public abstract class PayCalculator {
	// Define class properties
	private double payRate;
		
	// Define constructor
	public PayCalculator(double payRate) {
		changeRate(payRate);
	}
	
	// Define class methods
	public double getPay(double hours) {
		return(hours * payRate);
	}
	
	public void changeRate(double newRate) {
		payRate = newRate;
	}
}
