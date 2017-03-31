import java.util.Scanner;


public class UseDelimiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		// change input to 15.0,16.0,
		keyboard.useDelimiter(",");
		float firstVariable = keyboard.nextFloat();
		float secondVariable = keyboard.nextFloat();
		
		
		System.out.println(firstVariable);
		System.out.println(secondVariable);
	
		keyboard.close();
	}

}
