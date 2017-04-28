import java.util.*;

public class Arrays {
	final static int NUMBER_OF_VALUES = 5;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Integer[] numbers = new Integer[NUMBER_OF_VALUES];
		int distinctValues = 0;
		int i = 0;
		int k = 0;
		
		
		System.out.print("Enter " + numbers.length + " numbers: ");
		
		while(keyboard.hasNextInt()) {
			int number = keyboard.nextInt();
			
			boolean unique = true;
			
			for(int j = 0; j < 5; j++) {
				if(numbers[j] != null && number == numbers[j]) {
					unique = false;
				}
			}
			
			if(unique == true) {
				distinctValues++;
				numbers[k] = number;
				k++;
			}
			
			i++;
			if(i==5){break;}
			
		}
		
		
		System.out.print("The number of distinct values is: ");
		System.out.println(distinctValues);
		
		System.out.print("The distinct numberes are: ");
		for(int printNum = 0; printNum < distinctValues; printNum++) {
			System.out.print(numbers[printNum] + " ");
		}
		
		keyboard.close();
	}

}
