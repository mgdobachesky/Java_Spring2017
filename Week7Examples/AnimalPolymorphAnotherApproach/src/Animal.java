
public  class Animal {
	// move will do all of the work for the subclasses
	public void move(Animal targetAnimal){
		if (targetAnimal instanceof Bird)
			System.out.println("Flap, Flag, Flap");
		else if (targetAnimal instanceof Dog)
			System.out.println("Walk, sniff, walk, sniff");	
	  }
	  	  
}
