package application;

public class Card {
	
	// Class Properties
	private int value;
	private String rank;
	private String suit;
	
	// Class Constructor
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
		
		switch(getValue()) {
		case 9:
			this.rank = "Jack";
			break;
		case 10: 
			this.rank = "Queen";
			break;
		case 11: 
			this.rank = "King";
			break;
		case 12: 
			this.rank = "Ace";
			break;
		default:
			this.rank = Integer.toString(value + 2);
		}
	}
	
	// Getters
	public int getValue() {
		return this.value;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public String getSuit() {
		return this.suit;
	}
}
