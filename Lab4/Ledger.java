/**
 * 
 * @author mike91doby
 *
 */
public class Ledger {

	// Class properties
	private double[] sale;
	private int salesMade;
	private int maxSales;
	
	// Class constructors
	public Ledger(int max) {
		salesMade = 0;
		setMaxSales(max);
	}
	
	// Class setters
	private void setMaxSales(int max) {
		this.maxSales = max;
		sale = new double[getMaxSales()];
	}
	
	
	// Class getters
	public int getNumberOfSales() {
		return this.salesMade;
	}
	
	public int getMaxSales() {
		return this.maxSales;
	}
	
	
	// Class methods
	private void incrementSales() {
		salesMade++;
	}
	
	public void addSale(double d) throws IndexOutOfBoundsException {
		if(salesMade >= maxSales) {
			throw new IndexOutOfBoundsException();
		}
		this.sale[this.getNumberOfSales()] = d;
		incrementSales();
	}
	
	public double getTotalSales() {
		double total = 0;
		for(int i = 0; i < this.getMaxSales(); i++) {
			total += this.sale[i];
		}
		return total;
	}
	
	public double getAverageSale() throws ArithmeticException {
		if(this.salesMade == 0) {
			throw new ArithmeticException();
		}
		return (getTotalSales() / this.salesMade);
	}
	
	public int getCountAbove(double target) {
		int greaterCount = 0;
		for(int i = 0; i < this.getMaxSales(); i++) {
			if(this.sale[i] > target) {
				greaterCount++;
			}
		}
		return greaterCount;
	}
	
}
