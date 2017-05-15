package application;

import customExceptions.*;

import java.util.*;

public class WarCardGame {
	// Class Properties
	public static final int NUMBER_OF_PLAYERS = 2;
	private int roundsOfWar = 2;
	private Player human;
	private Player computer;
	private String humanCardImg = "";
	private String computerCardImg ="";
	private String outputMessage = "";
	private String numHumanCards = "";
	private String numComputerCards = "";
	private boolean warDeclared = false;
	LinkedList<Card> warCardPot = new LinkedList<Card>();
	
	// New game constructor
	public WarCardGame(Player human, Player computer) {
		this.human = human;
		this.computer = computer;
		try {
			DeckOfCards deck = new DeckOfCards();
			deck.shuffle();
			handoutCards(deck);
		} catch(DeckException e) {
			System.out.println("Deck configured incorrectly");
		}
	}
	
	// Getters
	public String getHumanCardImg() {
		return this.humanCardImg;
	}
	
	public String getComputerCardImg() {
		return this.computerCardImg;
	}
	
	public String getOutputMessage() {
		return this.outputMessage;
	}
	
	public String getNumHumanCards() {
		return this.numHumanCards;
	}
	
	public String getNumComputerCards() {
		return this.numComputerCards;
	}
	
	public boolean getWarDeclared() {
		return warDeclared;
	}
	
	// Setters
	private void setHumanCardImg(String rank, String suit) {
		this.humanCardImg = rank + "_of_" + suit + ".png";
	}
	
	private void setComputerCardImg(String rank, String suit) {
		this.computerCardImg = rank + "_of_" + suit + ".png";
	}
	
	private void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}
	
	private void setNumHumanCards(String numCards) {
		this.numHumanCards = numCards;
	}
	
	private void setNumComputerCards(String numCards) {
		this.numComputerCards = numCards;
	}
	
	private void setWarDeclared(boolean warDeclared) {
		this.warDeclared = warDeclared;
	}
	
	// Helper methods
	private void handoutCards(DeckOfCards deck) {
		for(int i = 0; i < DeckOfCards.DECK_SIZE; i++) {
			if(human.getCards().size() <= computer.getCards().size()) {
				human.addToCards(deck.getDeck().removeLast());
			} else {
				computer.addToCards(deck.getDeck().removeLast());
			}
		}
	}
	
	private boolean readyForWar() {
		// If player does not have enough cards to play a round of war
		// Then take that players cards and give them to the other player
		if(human.howManyCards() < roundsOfWar) {
			for(int i = 0; i < human.howManyCards(); i++) {
				warCardPot.add(human.getCards().removeFirst());
			}
			computer.getCards().addAll(warCardPot);
			System.out.println(human.getPlayerName() + " is not ready for war");
			setOutputMessage(human.getPlayerName() + " is not ready for war");
			return false;
		} else if (computer.howManyCards() < roundsOfWar) {
			for(int i = 0; i < computer.howManyCards(); i++) {
				warCardPot.add(human.getCards().removeFirst());
			}
			human.getCards().addAll(warCardPot);
			System.out.println(computer.getPlayerName() + " is not ready for war");
			setOutputMessage(computer.getPlayerName() + " is not ready for war");
			return false;
		}
		return true;
	}
	
	// Class methods
	public boolean gameOver() {
		if(!computer.hasCards()) {
			System.out.println(human.getPlayerName() + " wins game");
			setOutputMessage(human.getPlayerName() + " wins game!");
			return true;
		} else if(!human.hasCards()) {
			System.out.println(computer.getPlayerName() + " wins game");
			setOutputMessage(computer.getPlayerName() + " wins game!");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean playRound() {
		try{
			if(!gameOver()) {
				// Get a card from each player
				Card humansCard = human.playCard();
				Card computersCard = computer.playCard();
				
				// Display card names
				printCards(humansCard, computersCard);
				
				// Set card image
				setHumanCardImg(humansCard.getRank(), humansCard.getSuit());
				setComputerCardImg(computersCard.getRank(), computersCard.getSuit());
				
				// Add card to the pile of the player with the most cards
				// or war if they are equal
				if(humansCard.getValue() > computersCard.getValue()) {
					human.addToCards(humansCard);
					human.addToCards(computersCard);
					System.out.println(human.getPlayerName() + " wins round");
					setOutputMessage(human.getPlayerName() + " wins round");
				} else if(humansCard.getValue() < computersCard.getValue()) {
					computer.addToCards(humansCard);
					computer.addToCards(computersCard);
					System.out.println(computer.getPlayerName() + " wins round");
					setOutputMessage(computer.getPlayerName() + " wins round");
				} else if(humansCard.getValue() == computersCard.getValue()) {
					setOutputMessage("War!");
					System.out.println("War!");
					warCardPot.clear();
					warCardPot.add(humansCard);
					warCardPot.add(computersCard);
					
					// Go into war only if both players have enough cards to do so
					if(readyForWar()) {
						setWarDeclared(true);
					}
				}
				
				setNumHumanCards(human.howManyCards() + " cards");
				setNumComputerCards(computer.howManyCards() + " cards");
				printStats();
			//if(!gameOver()) {
			} else {
				// Return false if game is over
				return false;
			}
			
		} catch(PlayerNoCardsException e) {
			System.out.println("Player has no card to use");
		}
		
		// Return true by default
		return true;
	}
	
	public boolean war() {
		try {
			if(!gameOver()) {
				// Initialize placeholder for cards
				Card humansCard = null;
				Card computersCard = null;
				
				// Put cards into the pot
				for(int i = 0; i < roundsOfWar; i++) {
					// Play cards and add to pot
					humansCard = human.playCard();
					warCardPot.add(humansCard);
					computersCard = computer.playCard();
					warCardPot.add(computersCard);
				}
				
				// Display card names
				printCards(humansCard, computersCard);
				
				// Set card image
				setHumanCardImg(humansCard.getRank(), humansCard.getSuit());
				setComputerCardImg(computersCard.getRank(), computersCard.getSuit());
				
				// Add card to the pile of the player with the most cards
				// or war if they are equal
				if(humansCard.getValue() > computersCard.getValue()) {
					System.out.println(human.getPlayerName() + " wins War!");
					for(Card card : warCardPot) {
						human.addToCards(card);
					}
					setOutputMessage(human.getPlayerName() + " wins War!");
					setWarDeclared(false);
				} else if(humansCard.getValue() < computersCard.getValue()) {
					System.out.println(computer.getPlayerName() + " wins War!");
					for(Card card : warCardPot) {
						computer.addToCards(card);
					}
					setOutputMessage(computer.getPlayerName() + " wins War!");
					setWarDeclared(false);
				} else if(humansCard.getValue() == computersCard.getValue()) {
					setOutputMessage("Another War!");
					System.out.println("Another War!");
					
					// Go into war only if both players have enough cards
					readyForWar();
				}
				
				setNumHumanCards(human.howManyCards() + " cards");
				setNumComputerCards(computer.howManyCards() + " cards");
				printStats();
			//if(!gameOver()) {
			} else {
				// Return false if game is over
				return false;
			}
		} catch(PlayerNoCardsException e) {
			System.out.println("Player has no card to use");
		}
		return true;
	}
	
	public void printCards(Card humansCard, Card computersCard) {
		System.out.print(human.getPlayerName() + "s Card: ");
		humansCard.print();
		System.out.print(computer.getPlayerName() + "s Card: ");
		computersCard.print();
	}
	
	public void printStats() {
		// Print out results
		System.out.println(human.getPlayerName() + " has " + human.howManyCards() + " cards");
		System.out.println(computer.getPlayerName() + " has " + computer.howManyCards() + " cards\n");
	}
	
}
