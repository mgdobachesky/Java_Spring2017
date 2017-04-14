
public class RandomPlateNumber {
	public static void main(String[] args) {
		// declare variables
		int randomStart = (int)'A';
		int randomEnd = (int)'Z';
		int randomNumber = (int)(Math.random() * 10000);
		StringBuffer plateNumber = new StringBuffer();
		
		// append letters to license plate
		plateNumber.append((char)((Math.random() * (randomEnd - randomStart)) + randomStart));
		plateNumber.append((char)((Math.random() * (randomEnd - randomStart)) + randomStart));
		plateNumber.append((char)((Math.random() * (randomEnd - randomStart)) + randomStart));
		
		// if random number is less than 1000 then add a zero to the string to keep the number four digits
		if (randomNumber < 1000) {
			plateNumber.append(0);
		}
		
		// append number portion to plate
		plateNumber.append(randomNumber);
		
		// output plate number
		System.out.printf("A random vehicle plate number: %s", plateNumber);
	}
}