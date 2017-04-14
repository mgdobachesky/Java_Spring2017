import java.util.Scanner;

/**
 * 
 */

/**
 * @author BGANEK
 *
 */
public class TernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Sales Amount");

		float salesAmount = keyboard.nextFloat();
		
		if (salesAmount < 1000){
			System.out.println("You haven't made enough money");
		}
		else
			System.out.println("Good Job!");
		
		System.out.println("You did a " + ((salesAmount < 1000) ? "bad":"good") + " job");
				
		keyboard.close();
		
	}

}
