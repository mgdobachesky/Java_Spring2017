import java.util.*;
public class demoStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(5);
		st.push(10);
		System.out.println("Stack size = " + st.size());
		
		System.out.println("First element is " + st.peek());
		System.out.println("Stack size = " + st.size());
		
		System.out.println("Get first element - " + st.pop());
		System.out.println("Stack size = " + st.size());
		
		System.out.println("Is stack empty? - " + st.empty());
	
		
	}

}
