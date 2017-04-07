import java.util.Scanner;

public class RockPaperScissor {
	
	public static void main(String[] args) {
		// initialize variables
		String choice = "";
		String computerChoice = "";
		int choiceInt = -1;
		int computerChoiceInt = (int)(Math.random() * 3);
		
		// define an object to input data
		Scanner keyboard = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Please enter \"scissors\" \"rock\" or \"paper\" : ");
		// get input and store in variable
		choice = keyboard.nextLine();
		
		// convert choice to a number
		switch(choice.toLowerCase()) {
			case "rock":
				choiceInt = 0;
				break;
			case "paper":
				choiceInt = 1;
				break;
			case "scissors":
				choiceInt = 2;
				break;
			default:
				System.out.println("You did not enter valid input");
				System.exit(0);
				break;
		}
		
		// figure out what that choice is in english
		switch(computerChoiceInt) {
		case 0:
			 computerChoice = "rock";
			break;
		case 1:
			computerChoice = "paper";
			break;
		case 2:
			computerChoice = "scissors";
			break;
		}
		
		// if computer wins, else if computer loses
		if(computerChoiceInt == choiceInt) {
			System.out.printf("The computer is %s. You are %s. You draw", computerChoice, choice);
		} else if(computerChoiceInt - choiceInt == -2 || computerChoiceInt - choiceInt == 1) {
			System.out.printf("The computer is %s. You are %s. You lost", computerChoice, choice);
		} else if (computerChoiceInt - choiceInt == -1 || computerChoiceInt - choiceInt == 2) {
			System.out.printf("The computer is %s. You are %s. You won", computerChoice, choice);
		} else {
			System.out.printf("%d, %d", computerChoiceInt, choiceInt);
		}
		
		// close Scanner object
		keyboard.close();
	}
}
