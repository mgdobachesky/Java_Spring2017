import java.util.*;

public class Lab6 {

	public static void main(String[] args) {
		
		// Create a way for a user to add input
		Scanner keyboard = new Scanner(System.in);
		
		// Initialize variables
		String team = "";
		String teamNext = "";
		double revenue = 0;
		double revenueNext = 0;
		double total = 0;
		
		// Initialize linked lists
		LinkedList<String> stadiumNames = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();
		
		// Declare iterators for the linked lists
		Iterator<String> iteratorStadium;
		Iterator<Double> iteratorRevenue;
		
		// Output instructions to the user
		System.out.println("Enter the data now.");
		
		// Get the team from the user input
		team = keyboard.next();
		
		// If the input does not equal "done" add input to linked lists
		while(!team.equals("done")) {
			// Get the revenue input
			revenue = keyboard.nextInt();
			
			// Add data to linked lists
			stadiumNames.add(team);
			gameRevenue.add(revenue);
			
			// Get next line of input
			team = keyboard.next();
		}
		
		// Prompt the user to enter a team name to get revenue for
		System.out.println("Enter the name of a stadium to get the total revenue for:");
		// Store in team variable
		team = keyboard.next();
		
		// Initialize iterators
		iteratorStadium = stadiumNames.iterator();
		iteratorRevenue = gameRevenue.iterator();
		
		// Loop through the revenue linked list
		while(iteratorRevenue.hasNext()) {
			// Go to the next item on both linked lists
			revenueNext = iteratorRevenue.next();
			teamNext = iteratorStadium.next();
			
			// Add revenue to total if the chosen team is equal to the current linked list item
			if(team.equals(teamNext)) {
				total += revenueNext;
			}
		}
		
		// Print out the total
		System.out.println("The total revenue is " + total);
		
		// Close the Scanner object
		keyboard.close();
	}

}
