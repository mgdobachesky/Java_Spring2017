import java.util.ArrayList;

public class runExpandingSizeOfArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myData = new ArrayList<String>(5);
		myData.add("First Spot");
		myData.add("Second Spot");
		myData.add("Third Spot");
		myData.add("Fourth Spot");
		System.out.println("The size of the array is - " + myData.size());
		myData.add("Fifth Spot");
		myData.add("Sixth Spot");
		System.out.println("The size of the array is - " + myData.size());
		ArrayList<String> myDataDefaultSize = new ArrayList<String>();
		System.out.println("The size of the default array is - " + myDataDefaultSize.size());
		System.out.println("There is no easy way to get the capacity of the ArrayList");
	
		
		
		// determine capacity?
		
	}

}
