import java.util.Arrays;

public class DynamicResizingOfArrays {

	public static int[] resizeArray(int array[], int newSize){
		int newArray[] = new int[newSize];
		for(int i = 0 ; i < array.length - 1 ; i++){
		 newArray[i] = array[i];
		 }
		return (newArray);
		} // END OF METHOD

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeOfArray = 4;
		int i;
		int[] newArray = new int[sizeOfArray];
			
		for (i = 0;i < sizeOfArray - 1 ;i++){
			newArray[i] = i * 10;
		}
		
		newArray = resizeArray(newArray, 20);
		System.out.println(Arrays.toString(newArray));
		newArray[19] = 99;
		System.out.println(Arrays.toString(newArray));
		
		}
		
		
		
		
	}


