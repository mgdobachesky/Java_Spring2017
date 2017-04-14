import java.util.Scanner;


public class InputExample {
	public static final double INTEREST_RATE = 0.77;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double loanRequest;
		double loanAmount;
		int loanAmountInt;
		System.out.println("Enter the loan amount");
		loanRequest = keyboard.nextDouble();
		
		
		loanAmount = loanRequest * INTEREST_RATE;
		loanAmountInt = (int)loanAmount;
		
		System.out.println("loanAmount = " + loanAmount);
		System.out.println("loanAmountInt = " + loanAmountInt);
		
		keyboard.close();
	

	}

}
