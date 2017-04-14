
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int InitialNumber = 10;
		int var1;
		int var2;
		int var3;
		int var4;
		
		var1 = InitialNumber;
		var2 = var3 = var4 = var1;
		
		System.out.println("var1++ :" + var1++ );
		System.out.println("var2-- :" + var2--);
		System.out.println("++var3 : " + ++var3);
		System.out.println("--var4 : " + --var4);
		System.out.println();
		System.out.println("After increment/decrementing");
		System.out.println("");
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	}

}
