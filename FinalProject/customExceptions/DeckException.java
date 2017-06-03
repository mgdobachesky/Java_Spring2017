package customExceptions;

public class DeckException extends Exception {
	// Parameterless Constructor
    public DeckException() {}

    // Constructor that accepts a message
    public DeckException(String message)
    {
       super(message);
    }
}
