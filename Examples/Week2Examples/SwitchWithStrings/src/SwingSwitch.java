import java.util.Scanner;


public class SwingSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your zip code");
		Scanner keyboard = new Scanner(System.in);
		String ZipCode = keyboard.nextLine();
		
		switch (ZipCode){
		case "02864": 	
			System.out.println("You are in Cumberland");
			break;
		case "02910":
			System.out.println("You are in Warwick");
			break;
		default:
			System.out.println("I don\"t know where you are");			
		keyboard.close();
		
		}
	}

}
