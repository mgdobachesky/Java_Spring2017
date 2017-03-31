import java.util.Scanner;
import java.lang.Math;

public class Lab1a {

	public static void main(String[] args) {
		// define an object to input data
		Scanner keyboard = new Scanner(System.in);
		
		// define & initialize variables
		float x1 = 0;
		float y1 = 0;
		float x2 = 0;
		float y2 = 0;
		float result = 0;
		
		// prompt user for input
		System.out.println("Enter x1 and y1: ");
		// get input and store in variables
		x1 = keyboard.nextFloat();
		y1 = keyboard.nextFloat();
		
		// prompt user for input
		System.out.println("Enter x2 and y2: ");
		// get input and store in variables
		x2 = keyboard.nextFloat();
		y2 = keyboard.nextFloat();
		
		// calculate answer
		result = (float)Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		// output the answer
		System.out.printf("The distance of the two points is %f", result);
		
		// close the Scanner object
		keyboard.close();
	}

}
