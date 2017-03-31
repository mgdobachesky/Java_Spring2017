import java.util.Scanner;

public class InClass2b {

	public static void main(String[] args) {
		// define an object to input data
		Scanner keyboard = new Scanner(System.in);

		// define & initialize variables
		String strOne = "";
		String strTwo = "";
		String strThree = "";
		String strConcat = "";
		StringBuffer strBuf = new StringBuffer();
		
		// prompt user for input
		System.out.println("Enter three words: ");
		// get input and store in variable
		strOne = keyboard.nextLine();
		strTwo = keyboard.nextLine();
		strThree = keyboard.nextLine();
		
		// format concatenated result
		strConcat = strConcat.concat(strOne).concat(strTwo).concat(strThree);
		
		// format string buffer result
		strBuf.append(strOne);
		strBuf.append(strTwo);
		strBuf.append(strThree);
		
		// print output
		System.out.println("Concatenated String = " + strConcat);
		System.out.println("StringBuffer = " + strBuf);
	}

}
