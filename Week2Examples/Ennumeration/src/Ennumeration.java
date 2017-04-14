
public class Ennumeration {

	 /** Example 1 - simple list of enum constants.  */
	  public enum iceCream {
		  VANILLA,
		  CHOCOLATE,
		  STRAWBERRY
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (iceCream food : iceCream.values()) {
		    System.out.printf("The ice cream flavor is %s \n" , food.name());
		}

		iceCream favoriteIceCream = iceCream.CHOCOLATE;
		
		switch (favoriteIceCream)
		{
		case VANILLA:
			System.out.println("I like boring vanilla");
			break;
		case CHOCOLATE:
			System.out.println("I love chocolate");
			break;
		case STRAWBERRY:
			System.out.println("I am wierd, I like strawberry");
			break;
		}
		
		
		
	}
}


