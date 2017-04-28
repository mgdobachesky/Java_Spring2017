import java.util.*;
public class ExceptionHandling {
	final static int RANDOM_INTEGERS = 100;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int indexNumber = 0;
		
		Integer[] randomArray = new Integer[RANDOM_INTEGERS];
		
		for(int i = 0; i < RANDOM_INTEGERS; i++) {
			randomArray[i] = (int)(Math.random() * 10_000);
		}

		try {
			System.out.print("Enter an index: ");
			indexNumber = keyboard.nextInt();
			System.out.print("The element is " + randomArray[indexNumber]);
		} catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.print("Index is out of bounds");
		} catch(Exception e) {
			System.out.print("Unknown error");
		} 
		
		keyboard.close();
	}

}
