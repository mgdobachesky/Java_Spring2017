
public class EqualsWithObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson firstGuy = new SalesPerson("bruce", "ganek");
		SalesPerson secondGuy = new SalesPerson("bruce","ganek");
		
		if (firstGuy == secondGuy)
		{
			System.out.println("The two people are equal");
		}
		else
			System.out.println("The two people are not equal");
			
		if (firstGuy.equals(secondGuy)){
			System.out.println("The two people are equal");
		}
		else
			System.out.println("The two people are not equal");
	}

}
