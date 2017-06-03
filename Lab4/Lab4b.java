
public class Lab4b {
	// Define the number of lockers
	final static int NUMBER_OF_LOCKERS = 100;
	
	public static void main(String[] args) {
		// Define the lockers
		boolean[] lockers = new boolean[NUMBER_OF_LOCKERS];
	
		// Do this operation for each student
		for(int student = 1; student <= NUMBER_OF_LOCKERS; student++) {
			// Do this operation for appropriate lockers
			for(int locker = student; locker <= NUMBER_OF_LOCKERS; locker += student) {
				// If the locker is landed on then open or close it
				if(lockers[locker - 1] == true) {
					lockers[locker - 1] = false;
				} else if(lockers[locker - 1] == false) {
					lockers[locker - 1] = true;
				}
			}
		}
		
		// Loop through the lockers and print out what ones are open
		for(int i = 0; i < NUMBER_OF_LOCKERS; i++) {
			if(lockers[i] == true) {
				System.out.println("Locker " + (i + 1) + " is open");
			}
		}
	}
	
}
