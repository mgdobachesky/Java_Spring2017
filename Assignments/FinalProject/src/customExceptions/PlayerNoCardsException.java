package customExceptions;

public class PlayerNoCardsException extends Exception {
	// Parameterless Constructor
    public PlayerNoCardsException() {}

    // Constructor that accepts a message
    public PlayerNoCardsException(String message)
    {
       super(message);
    }
}
