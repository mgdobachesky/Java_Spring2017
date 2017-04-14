
public class SalesPerson {
	private static int numberOfSalesPeople = 0;
	
	public String FirstName;
	public String LastName;
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
}
