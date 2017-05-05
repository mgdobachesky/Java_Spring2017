// from http://www.java-samples.com/showtutorial.php?tutorialid=369
// Java Samples
import java.util.*;
public class runHashMap {
	public static void main(String args[]) {
		// Create a hash map
		HashMap<String,Double> hm = new HashMap<String,Double>();
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		System.out.println("Ralph's balance is:" + hm.get("Ralph Smith") + "\n");
		// Get a set of the entries
		Set<Map.Entry<String,Double>> set = hm.entrySet();
		// Get an iterator
		Iterator<Map.Entry<String,Double>> i = set.iterator();
		// Display elements
		while(i.hasNext()) {
		Map.Entry<String,Double> me = (Map.Entry<String,Double>)i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into John Doe's account
		double balance = ((Double)hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " +
		hm.get("John Doe"));

		} 
	
		
}
