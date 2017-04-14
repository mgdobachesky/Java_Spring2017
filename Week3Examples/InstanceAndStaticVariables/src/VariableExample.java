
public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson firstGuy = new SalesPerson("bruce", "ganek");
		SalesPerson secondGuy = new SalesPerson("Mickey","Mouse");
		
		System.out.println("First Person's name is " + firstGuy.FirstName + " " + firstGuy.LastName);
		System.out.println("Second Person's name is " + secondGuy.FirstName + " " + secondGuy.LastName);
		System.out.println("First Person's Sales ID = " + firstGuy.salesID);
		System.out.println("Second Person's Sales ID = " + secondGuy.salesID);
	
		firstGuy.FirstName = "John";
		System.out.println("------------------------------\n\n");
		System.out.println("First Person's name is " + firstGuy.FirstName + " " + firstGuy.LastName);
		System.out.println("Second Person's name is " + secondGuy.FirstName + " " + secondGuy.LastName);
		System.out.println("First Person's Sales ID = " + firstGuy.salesID);
		System.out.println("Second Person's Sales ID = " + secondGuy.salesID);
		
			
	}

}
