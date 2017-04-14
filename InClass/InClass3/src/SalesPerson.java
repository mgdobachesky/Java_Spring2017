
public class SalesPerson {
	
	// properties
	private String FirstName;
	private String LastName;
	
	
	// constructors
	public SalesPerson() {
		FirstName = "";
		LastName = "";
	}
	
	public SalesPerson(String firstName, String lastName) {
		FirstName = firstName;
		LastName = lastName;
	}
	
	
	// setters and getters
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	// methods
	public boolean print() {
		StringBuffer printMessage = new StringBuffer();
		printMessage.append(FirstName);
		printMessage.append(" ");
		printMessage.append(LastName);
		
		System.out.println(printMessage);
		return true;
	}
	
	public boolean equals(SalesPerson p1) {
		if(this.FirstName.equals(p1.FirstName) && this.LastName.equals(p1.LastName)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	// static methods
	public static float calculateCommission(float commissionRate, int salesAmount) {
		return commissionRate * salesAmount;
	}
	
	public static float calculateCommission(float commissionRate, float salesAmount) {
		return commissionRate * salesAmount;
	}
	
	
	// main program
	public static void main(String[] args) {
		// variables
		float salesCommission;
		
		// make a mike person and call the print method
		SalesPerson mike = new SalesPerson("Michael", "Dobachesky");
		mike.print();
		
		// make another person and set the first and last name properties
		SalesPerson another = new SalesPerson();
		another.setFirstName("another");
		another.setLastName("person");
		
		// make another person and set the first and last name properties
		SalesPerson another2 = new SalesPerson();
		another2.setFirstName("another");
		another2.setLastName("person");
		
		// print out if a person is equal to another
		System.out.println(mike.equals(another));
		System.out.println(another.equals(another2));
		
		// calculate sales commission with static methods
		salesCommission = SalesPerson.calculateCommission(0.5f, 100);
		System.out.println("The sales commission is " + salesCommission);
		
		salesCommission = SalesPerson.calculateCommission(0.5f, 100.5f);
		System.out.println("The sales commission is " + salesCommission);
		
	}
}
