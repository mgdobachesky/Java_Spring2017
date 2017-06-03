/**
 * 
 * @author mike91doby
 *
 */
public class Lab3b {

	public static void main(String[] args) {
		// set the interest rate for all accounts
		Account.setAnnualInterestRate(4.5);
		
		// create new account with id of 1122 and balance of 20,000
		Account account1 = new Account(1122, 20_000);
		
		// withdraw $2,500
		account1.withdraw(2_500);
		
		// deposit $3,000
		account1.deposit(3_000);
		
		// print totals
		System.out.print("Balance is ");
		System.out.println(account1.getBalance());
		System.out.print("Monthly interest is ");
		System.out.println(account1.getMonthlyInterest());
		System.out.print("This account was created at ");
		System.out.println(account1.getDateCreated());
	}

}
