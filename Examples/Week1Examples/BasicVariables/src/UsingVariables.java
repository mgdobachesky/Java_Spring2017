
public class UsingVariables {
	// watch what happens if you put this in a method
	public static final double INTEREST_RATE = 0.77;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double loanRequest;
		double loanAmount;
		int loanAmountInt;
		loanRequest = 2200.50;
		
		loanAmount = loanRequest * INTEREST_RATE;
		loanAmountInt = (int)loanAmount;
		
		System.out.println("loanAmount = " + loanAmount);
		System.out.println("loanAmountInt = " + loanAmountInt);

	

	}

}
