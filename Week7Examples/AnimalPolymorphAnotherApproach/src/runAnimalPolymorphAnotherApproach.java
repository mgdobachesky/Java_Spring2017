
public class runAnimalPolymorphAnotherApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Animal a;

	    // create some objects and move them
		for (int i = 0; i < 10; i++)
		{
		    if (Math.random() < 0.5)
			a = new Dog();
		    else
			a = new Bird();
		
	    	// we do not know what kind of 
		    // animal we are asking to move!
		    a.move(a);
		}

		System.out.println("System Exiting");
	    }
	}


