
public class runAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		Dog myDog;
		Bird myBird;
		for (int i = 0; i < 10; i++)
		{
		    if (Math.random() < 0.5){
		    	// create a dog
		    	a = new Dog();
		    }
		    else {
		    	//create a bird
		    	a = new Bird();
		    }
		    // now call the right move method
		    a.move();
		}
	}

}