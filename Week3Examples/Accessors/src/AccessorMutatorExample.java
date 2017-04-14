
public class AccessorMutatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson firstSalesPerson = new SalesPerson();
		firstSalesPerson.FirstName = "John";
		firstSalesPerson.setLastName("Smith");
		
		System.out.println("The first sales person is : "+  firstSalesPerson.FirstName + " " +
				firstSalesPerson.getLastName());
		
		SalesPerson secondSalesPerson = new SalesPerson("Mickey", "Mouse");
		System.out.println("The second sales person is : " + secondSalesPerson.FirstName + " " +
				secondSalesPerson.getLastName());
		
		System.out.println("The ID of salesperson 2 is: " + secondSalesPerson.salesID);
	}

}
