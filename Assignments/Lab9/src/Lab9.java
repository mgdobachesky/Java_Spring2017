
public class Lab9 {

	public static void main(String[] args) {
		
		BulkDiscount bulkDiscount = new BulkDiscount(2, 10);
		BuyNItemsGetOneFree buyNItemsGetOneFree = new BuyNItemsGetOneFree(2);
		
		System.out.println(bulkDiscount.computeDiscount(5, 20));
		System.out.println(buyNItemsGetOneFree.computeDiscount(5, 20));
	}

}
