
public class SizeOfMultidimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] salesPerson = {{"Bruce","Sam"},{"Ganek","Spade","test"},
				{"Walt", "Disney"}};
		
		System.out.println("Number of rows = " + salesPerson.length);
		System.out.println("Size of first row = " + salesPerson[0].length);
		System.out.println("Size of second row = " + salesPerson[1].length);
		System.out.println("Size of third row = " + salesPerson[2].length);
		
		
	}

}
