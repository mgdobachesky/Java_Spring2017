import java.util.Scanner;

public class InClass2a {

	public static void main(String[] args) {
		// define a method to input data
		Scanner keyboard = new Scanner(System.in);
		
		// define variables
		float distance = 0;
		float fuelEfficiency = 0;
		float pricePerGallon = 0;
		float result = 0;
		
		// prompt user for input
		System.out.println("Enter driving distance: ");
		// get input and store in variable
		distance = keyboard.nextFloat();
		
		// prompt user for input
		System.out.println("Enter miles per gallon: ");
		// get input and store in variable
		fuelEfficiency = keyboard.nextFloat();
		
		// prompt user for input
		System.out.println("Enter price per gallon: ");
		// get input and store in variable
		pricePerGallon = keyboard.nextFloat();
		
		// calculate cost of trip
		result = (distance * pricePerGallon) / fuelEfficiency;
		
		// print output
		System.out.printf("The cost of driving is $%5.2f", result);
	}

}