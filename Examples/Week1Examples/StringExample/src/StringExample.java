
public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String addressString = "";
	addressString = "Main Street, USA";
	System.out.println(101 + " Main Street");
	System.out.println("String length is " + addressString.length());
	System.out.println("Character as index spot 6 (7th character) is: " + addressString.charAt(6));
	System.out.println(addressString.compareTo("Main Street, USA"));
	// won't match because of case
	System.out.println(addressString.compareTo("Main Street, usa"));
	System.out.println(addressString.compareToIgnoreCase("Main Street, usa"));
	// Note the carriage return
	System.out.println("Substring Test = " + addressString.substring(5,10) + '\n');
	
	String aStudent = "James Bond"; 
	String aGrade = "A"; 
	StringBuffer strBuf = new StringBuffer(); 
	strBuf.append(aStudent); 
	strBuf.append("received a grade of "); 
	strBuf.append(aGrade); 

	System.out.println(strBuf.toString());
	

	}

}
