package application;

import java.util.*;

public class DeckOfCards {
	
	// Class Properties
	private final static int DECK_SIZE = 52;
	private final static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private LinkedList<Card> deck = new LinkedList<Card>();
	
	// Class Constructor
	public DeckOfCards() {
		for(String suit : suits) {
			for(int rank = 0; rank < (DECK_SIZE/suits.length); rank++) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	// Getters
	public LinkedList<Card> getDeck() {
		return deck;
	}
	
	// Methods
	public void print() {
		for(Card card : getDeck()) {
			card.print();
		}
	}
	
	public void shuffleDeck() {
		for(int i = 0; i < DECK_SIZE; i++) {
			int randomPosition = (int)Math.floor(Math.random() * DECK_SIZE);
			deck.add(randomPosition, deck.removeLast());
		}
	}
	
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		
		deck.print();
		System.out.println();
		
		deck.shuffleDeck();
		deck.print();
	}
}
