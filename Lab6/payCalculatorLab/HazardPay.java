package payCalculatorLab;

public class HazardPay extends PayCalculator {
	// Define class constructor
	public HazardPay(double payRate) {
		super(payRate);
	}
	
	// Define class methods
	@Override
	public double getPay(double hours) {
		return(super.getPay(hours) * 1.5);
	}
}
