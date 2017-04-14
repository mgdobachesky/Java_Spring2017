import java.util.Scanner;

public class EncapsulationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "";
		String lastName = "";
		String tryAgain = "";
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
		System.out.println("Enter the new salesperson's name");
		firstName = keyboard.next();
		lastName = keyboard.nextLine();
		
		
		SalesPerson newPerson = new SalesPerson(firstName,lastName);
		newPerson.print(newPerson);
		System.out.println("Try again?");
		tryAgain = keyboard.nextLine();
		} while (!tryAgain.toUpperCase().equals("N")); 
		System.out.println("Exit Program");
		keyboard.close();
	}
}
