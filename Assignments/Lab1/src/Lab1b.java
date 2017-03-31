import java.util.Scanner;

public class Lab1b {

	public static void main(String[] args) {
		// define an object to input data
		Scanner keyboard = new Scanner(System.in);
		
		// define & initialize variables
		int firstWordEnd = 0;
		char firstLetter = '\0';
		String firstWord = "";
		String originalString = "";
		String partialString = "";
		StringBuffer finalString = new StringBuffer();
		
		// prompt user for input
		System.out.println("Enter a line of text. No punctuation please.");
		// get input and store in variable
		originalString = keyboard.nextLine();
		
		// find index of the ending of the first word
		firstWordEnd = (originalString.indexOf(" ") + 1);
		// place first word of string into a substring
		firstWord = originalString.substring(0, firstWordEnd);
		
		// create a partial string that does not include the first word of the original
		partialString = originalString.substring(firstWordEnd);
		// get the first letter of the original string
		firstLetter = partialString.charAt(0);
		// store a capitalized version of the original string
		firstLetter = Character.toUpperCase(firstLetter);
		// cut off the first letter of the partial string
		partialString = partialString.substring(1);
		
		// format the original string
		finalString.append(firstLetter);
		finalString.append(partialString);
		finalString.append(" ");
		finalString.append(firstWord);
		
		// output the formatted text
		System.out.println("I have rephrased that line to read: ");
		System.out.println(finalString);
		
		// close the Scanner object
		keyboard.close();
	}

}
