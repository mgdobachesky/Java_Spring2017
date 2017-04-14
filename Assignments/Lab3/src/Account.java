import java.util.*;

/**
 * 
 * @author mike91doby
 *
 */
public class Account {
	// class properties
	private static double annualInterestRate = 0;
	
	// instance properties
	private int id = 0;
	private double balance = 0;
	private Date dateCreated;
	
	
	// constructors
	public Account() {
		this.id = 0;
		this.balance = 0;
		dateCreated = new java.util.Date();
	}
	
	public Account(int accountId, double accountBalance) {
		this();
		this.setId(accountId);
		this.setBalance(accountBalance);
	}

	
	// getters
	public static double getAnnualInterestRate() {
		return(annualInterestRate / 100);
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	//setters
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	private void setId(int id) {
		this.id = id;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// class helper methods
	private static double getMonthlyInterestRate() {
		return(getAnnualInterestRate() / 12);
	} 
	
	// instance methods
	public double getMonthlyInterest() {
		return(getMonthlyInterestRate() * getBalance());
	}
	
	public boolean withdraw(double amount) {
		setBalance(getBalance() - amount);
		return true;
	}
	
	public boolean deposit(double amount) {
		setBalance(getBalance() + amount);
		return true;
	}
	
}
