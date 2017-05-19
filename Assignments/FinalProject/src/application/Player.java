package application;

import java.util.*;
import customExceptions.*;

public class Player {
	// Instance properties
	private LinkedList<Card> cards = new LinkedList<Card>();
	private String playerName;
	private String pathToLastCardImage;
	
	// Constructors
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	// Getters
	public LinkedList<Card> getCards() {
		return cards;
	}
	
	public String getPathToLastCardImage() {
		return pathToLastCardImage;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	// Setters
	private void setPathToLastCardImage(Card card) {
		pathToLastCardImage = card.getRank() + "_of_" + card.getSuit() + ".png";
	}
	
	// Instance Methods
	public void addToCards(Card card) {
		int randomPosition = (int)Math.floor(Math.random() * cards.size());
		cards.add(randomPosition, card);
	}
	
	public Card playCard() throws PlayerNoCardsException {
		if(cards.size() > 0) {
			Card card = cards.removeLast();
			setPathToLastCardImage(card);
			return card;
		} else {
			throw new PlayerNoCardsException();
		}
	}
	
	public int howManyCards() {
		return cards.size();
	}
	
	public boolean hasCards() {
		if(cards.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
