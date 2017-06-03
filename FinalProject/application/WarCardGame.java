package application;

import customExceptions.*;

import java.util.*;

public class WarCardGame {
	// Class properties
	private final static int ROUNDS_OF_WAR = 2;
	
	// Instance properties
	private Player playerOne;
	private Player playerTwo;
	private String outputMessage = "";
	private boolean warDeclared = false;
	LinkedList<Card> warCardPot = new LinkedList<Card>();
	
	// New game constructor
	public WarCardGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		try {
			DeckOfCards deck = new DeckOfCards();
			deck.shuffle();
			handoutCards(deck);
		} catch(DeckException e) {
			System.out.println("Deck configured incorrectly");
		}
	}
	
	// Getters
	public String getOutputMessage() {
		return this.outputMessage;
	}
	
	public boolean getWarDeclared() {
		return warDeclared;
	}
	
	// Setters
	private void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}
	
	private void setWarDeclared(boolean warDeclared) {
		this.warDeclared = warDeclared;
	}
	
	// Helper methods
	private void handoutCards(DeckOfCards deck) {
		for(int i = 0; i < DeckOfCards.DECK_SIZE; i++) {
			if(playerOne.getCards().size() <= playerTwo.getCards().size()) {
				playerOne.addToCards(deck.getDeck().removeLast());
			} else {
				playerTwo.addToCards(deck.getDeck().removeLast());
			}
		}
	}
	
	private boolean readyForWar() {
		// If player does not have enough cards to play a round of war
		// then take that players cards and give them to the other player
		if(playerOne.howManyCards() < ROUNDS_OF_WAR) {
			for(int i = 0; i < playerOne.howManyCards(); i++) {
				warCardPot.add(playerOne.getCards().removeFirst());
			}
			playerTwo.getCards().addAll(warCardPot);
			setOutputMessage(playerOne.getPlayerName() + " is not ready for war");
			return false;
		} else if (playerTwo.howManyCards() < ROUNDS_OF_WAR) {
			for(int i = 0; i < playerTwo.howManyCards(); i++) {
				warCardPot.add(playerOne.getCards().removeFirst());
			}
			playerOne.getCards().addAll(warCardPot);
			setOutputMessage(playerTwo.getPlayerName() + " is not ready for war");
			return false;
		}
		return true;
	}
	
	// Instance methods
	public boolean gameOver() {
		// If either player has no cards then the game is over
		if(!playerTwo.hasCards()) {
			setOutputMessage(playerOne.getPlayerName() + " wins game!");
			return true;
		} else if(!playerOne.hasCards()) {
			setOutputMessage(playerTwo.getPlayerName() + " wins game!");
			return true;
		}
		
		return false;
	}
	
	public void playRound() {
		// Play a round of war
		try{
			if(!gameOver()) {
				// Get a card from each player
				Card playerOnesCard = playerOne.playCard();
				Card playerTwosCard = playerTwo.playCard();
				
				// Add card to the pile of the player with the most cards
				// or war if they are equal
				if(playerOnesCard.getValue() > playerTwosCard.getValue()) {
					playerOne.addToCards(playerOnesCard);
					playerOne.addToCards(playerTwosCard);
					setOutputMessage(playerOne.getPlayerName() + " wins round");
				} else if(playerOnesCard.getValue() < playerTwosCard.getValue()) {
					playerTwo.addToCards(playerOnesCard);
					playerTwo.addToCards(playerTwosCard);
					setOutputMessage(playerTwo.getPlayerName() + " wins round");
				} else if(playerOnesCard.getValue() == playerTwosCard.getValue()) {
					setOutputMessage("War!");
					warCardPot.clear();
					warCardPot.add(playerOnesCard);
					warCardPot.add(playerTwosCard);
					
					// Go into war only if both players have enough cards to do so
					if(readyForWar()) {
						setWarDeclared(true);
					}
				}
			}
			
		} catch(PlayerNoCardsException e) {
			System.out.println("Player has no card to use");
		}
	}
	
	public void war() {
		try {
			if(!gameOver()) {
				// Initialize placeholder for cards
				Card playerOnesCard = null;
				Card playerTwosCard = null;
				
				// Put cards into the pot
				for(int i = 0; i < ROUNDS_OF_WAR; i++) {
					// Play cards and add to pot
					playerOnesCard = playerOne.playCard();
					warCardPot.add(playerOnesCard);
					playerTwosCard = playerTwo.playCard();
					warCardPot.add(playerTwosCard);
				}
				
				// Add card to the pile of the player with the most cards
				// or war if they are equal
				if(playerOnesCard.getValue() > playerTwosCard.getValue()) {
					for(Card card : warCardPot) {
						playerOne.addToCards(card);
					}
					setOutputMessage(playerOne.getPlayerName() + " wins War!");
					setWarDeclared(false);
				} else if(playerOnesCard.getValue() < playerTwosCard.getValue()) {
					for(Card card : warCardPot) {
						playerTwo.addToCards(card);
					}
					setOutputMessage(playerTwo.getPlayerName() + " wins War!");
					setWarDeclared(false);
				} else if(playerOnesCard.getValue() == playerTwosCard.getValue()) {
					setOutputMessage("Another War!");
					
					// Go into war only if both players have enough cards
					readyForWar();
				}
			}
			
		} catch(PlayerNoCardsException e) {
			System.out.println("Player has no card to use");
		}
	}
	
}
