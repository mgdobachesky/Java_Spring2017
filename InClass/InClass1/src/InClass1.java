import java.util.*;

public class InClass1 {

	public static void main(String[] args) {
		// define a method to input data
		Scanner keyboard = new Scanner(System.in);
		
		// define variables
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		// prompt user for input
		System.out.println("Enter the first number");
		// get input and store in variable
		input1 = keyboard.nextDouble();
		
		// prompt user for input
		System.out.println("Enter the second number");
		// get input and store in variable
		input2 = keyboard.nextDouble();
		
		// calculate the result
		result = input1 * input2;
		
		// print out the result in both double and int format
		System.out.printf("double result = %f", result);
		System.out.println();
		System.out.printf("int result = %d", (int)result);
		System.out.println();
	}

}
