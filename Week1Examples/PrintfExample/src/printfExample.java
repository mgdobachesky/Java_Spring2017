
public class printfExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here are some numeric values " + "in different formats.\n");

	    System.out.printf("Various integer formats: ");
	    System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

	    System.out.println();

	    System.out.printf("Default floating-point format: %f\n", 1234567.123);
	    System.out.printf("Floating-point with commas: %,f\n", 1234567.123);
	    System.out.printf("Negative floating-point default: %,f\n", -1234567.123);
	    System.out.printf("Negative floating-point option: %,(f\n", -1234567.123);

	    System.out.println();

	    System.out.printf("Line-up positive and negative values:\n");
	    System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
	    
	    double pi = Math.PI;
	    System.out.printf ("pi = %5.3f%n", pi);
	    
	    double q = 1.0/3.0;
	    // Print the number with 3 decimal places.
	    System.out.printf ("1.0/3.0 = %5.3f %n", q);

	    // Increase the number of decimal places
	    System.out.printf ("1.0/3.0 = %7.5f %n", q);

	    // Pad with zeros.
	    q = 1.0/2.0;
	    System.out.printf ("1.0/2.0 = %09.3f %n", q);

	    // Scientific notation
	    q = 1000.0/3.0;
	    System.out.printf ("1000/3.0 = %7.2e %n", q);

	    // More scientific notation
	    q = 3.0/4567.0;
	    System.out.printf ("3.0/4567.0 = %7.2e %n", q);

	    // Negative infinity
	    q = -1.0/0.0;
	    System.out.printf ("-1.0/0.0 = %7.2e %n", q);

	    q = 0.0/0.0;
	    // NaN
	    System.out.printf ("0.0/0.0 = %5.2e %n", q);

	    // Multiple arguments
	    System.out.printf ("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);

	    double r = 1.1;
	    // User the argument index to put the argument values into
	    // different locations within the string.
	    System.out.printf ("C = 2 * %1$5.5f * %2$4.1f, "+
	                       "A = %2$4.1f * %2$4.1f * %1$5.5f %n",
	                         Math.PI, r);

	}

}
