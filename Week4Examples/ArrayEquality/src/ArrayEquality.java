import java.util.Arrays;
public class ArrayEquality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] firstArray = {100,200,300,400};
		int[] secondArray = {100,200,300,400};
		
		int[] thirdArray = new int[4];
		int[] fourthArray = new int[4];
		
		for (int i = 0; i < thirdArray.length - 1;i++){
			thirdArray[i] = i;
			fourthArray[i] = i;
		}
		
		
		if (firstArray == secondArray)
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");
		
		if (firstArray.equals(secondArray))
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");
		
		if (Arrays.equals(firstArray,secondArray))
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");
		

		if (thirdArray == fourthArray)
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");
		
		if (thirdArray.equals(fourthArray))
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");
		
		if (Arrays.equals(thirdArray,fourthArray))
			System.out.println("The two arrays are equal");
		else
			System.out.println("The two arrays are not equal");

	}

}
