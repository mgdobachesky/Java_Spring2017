
public class runActor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   Actor1 hamlet = new Actor1();
		    Actor2 juliet = new Actor2();
		    hamlet.act();
		    juliet.act();
		    System.out.println("\nWith Polymorphism\n");
		    tryout(hamlet);
		    tryout(juliet);		    
	}

	private static void tryout(Act actor) {
	    actor.act();
	}
}
