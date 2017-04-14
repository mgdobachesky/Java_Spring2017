
public class SalesPerson {
	private static int numberOfSalesPeople = 0;
	
	public String FirstName;
	private String LastName;
	public int salesID;
	
	public SalesPerson(){
		FirstName = "";
		LastName = "";
		salesID = ++numberOfSalesPeople;
	}
	
	public SalesPerson(String SalesFirstName,String SalesLastName){
		FirstName = SalesFirstName;
		LastName = SalesLastName;
		salesID = ++numberOfSalesPeople;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}


	
/*	public boolean equals(SalesPerson target){
		if (this.FirstName.equals(target.FirstName) &&
				(this.LastName.equals(target.LastName)))
				return true;
		else
				return false;
	}
*/		
}
