
public class SalesPerson {
	private static int numberOfSalesPeople = 0;
	
	private String FirstName;
	private String LastName;
	private int salesID;
		
	public SalesPerson(){
		this.setFirstName("");
		this.setLastName("");
		salesID = ++numberOfSalesPeople;
	}
	
	public SalesPerson(String SalesFirstName,String SalesLastName){
		this.setFirstName(SalesFirstName);
		this.setLastName(SalesLastName);
		salesID = ++numberOfSalesPeople;
	}

	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		// take into account just a space
		if (lastName.length() >= 2)
			LastName = lastName;
		else
			LastName = "No Name";		
		}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public int getSalesID() {
		return salesID;
	}


	
	public boolean equals(SalesPerson target){
		if (this.FirstName.equals(target.FirstName) &&
				(this.LastName.equals(target.LastName)))
				return true;
		else
				return false;
	}
	
	public void print(SalesPerson person){
		System.out.println("The first name of the person is: " + this.getFirstName());
		System.out.println("The last name of the person is: " + this.getLastName());
		System.out.println("Their sales id is:" + this.getSalesID());
	}
			
		
}
