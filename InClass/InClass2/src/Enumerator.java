public class Enumerator {
	public enum IceCream {CHOCOLATE, VANILLA, STRAWBERRY}
	
	public static void main(String[] args) {
		for(IceCream flavor : IceCream.values()) {
			System.out.printf("The ice cream flavor is %s \n", flavor.name());
		}
		
		IceCream flavor = IceCream.STRAWBERRY;
		
		switch (flavor) {
		case CHOCOLATE:
			System.out.println("Chocolate is a flavor");
			break;
		case VANILLA:
			System.out.println("Vanilla is a flavor");
			break;
		case STRAWBERRY:
			System.out.println("Strawberry is a flavor");
			break;
		default:
			System.out.println("Pick a flavor");
			break;
		}
	}

}