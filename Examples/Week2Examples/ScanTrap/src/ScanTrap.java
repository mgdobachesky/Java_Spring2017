import java.util.Scanner;
public class ScanTrap {

	/* try entering this 
	12 is the first number
	this is the second line
	this is the third	
	
	*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int counter;
		String sline1, sline2;
		counter = keyboard.nextInt();
		sline1 = keyboard.nextLine();
		sline2 = keyboard.nextLine();
		
		System.out.println("counter = " + counter);
		System.out.println("sline1 = " + sline1);
		System.out.println("sline2 = " + sline2);
		
		keyboard.close();
		

	}

}
