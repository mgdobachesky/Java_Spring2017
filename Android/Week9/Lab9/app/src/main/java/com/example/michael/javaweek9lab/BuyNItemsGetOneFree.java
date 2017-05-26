package com.example.michael.javaweek9lab;

public class BuyNItemsGetOneFree extends DiscountPolicy {
	
	private int n;
	
	public BuyNItemsGetOneFree(int n) {
		this.n = n;
	}
	
	public float computeDiscount(int count, float itemCost) {
		if((count/n) != 0) {
			return((count/n) * itemCost);
		} else {
			return count * itemCost;
		}
	}
}
