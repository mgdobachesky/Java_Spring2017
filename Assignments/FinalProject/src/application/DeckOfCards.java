package application;

import java.util.*;
import customExceptions.*;

public class DeckOfCards {
	
	// Class properties
	public final static int DECK_SIZE = 52;
	private final static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	// Instance properties
	private LinkedList<Card> deck = new LinkedList<Card>();
	
	// Constructors
	public DeckOfCards() throws DeckException {
		for(String suit : suits) {
			if(DECK_SIZE % suits.length != 0) {
				throw new DeckException();
			}
			
			for(int rank = 0; rank < (DECK_SIZE/suits.length); rank++) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	// Getters
	public LinkedList<Card> getDeck() {
		return deck;
	}
	
	// Instance Methods
	public void shuffle() {
		for(int i = 0; i < DECK_SIZE; i++) {
			int randomPosition = (int)Math.floor(Math.random() * DECK_SIZE);
			deck.add(randomPosition, deck.removeLast());
			deck.add(randomPosition, deck.removeFirst());
		}
	}
	
	public void sort() {
		try {
			DeckOfCards deck = new DeckOfCards();
			this.deck = deck.getDeck();
		} catch(DeckException e) {
			System.out.println("Deck configured incorrectly");
		}
	}
}
