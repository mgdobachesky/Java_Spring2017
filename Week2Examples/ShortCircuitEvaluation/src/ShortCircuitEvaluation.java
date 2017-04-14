
public class ShortCircuitEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salesAmount;
		int months;
		float salesPerMonth = 0;
		boolean bStatus = false;
		months = 0;
		salesAmount = 1000;
		
		if ((bStatus) && ((salesAmount / months) > 0)){
			salesPerMonth = salesAmount / months;
			System.out.println("salesPerMonth = " + salesPerMonth);
		}
		else
			System.out.println("Error calculating sales per month");
		
		if ((bStatus) & ((salesAmount / months) > 0)){
			salesPerMonth = salesAmount / months;
			System.out.println("salesPerMonth = " + salesPerMonth);
		}
		else
			System.out.println("Error calculating sales per month with 'eager operator'");
		
		if (((salesAmount / months) > 0) && (bStatus)){
			salesPerMonth = salesAmount / months;
			System.out.println("salesPerMonth = " + salesPerMonth);
		}
		else
			System.out.println("Error calculating sales per month");
			
		
	}

}
