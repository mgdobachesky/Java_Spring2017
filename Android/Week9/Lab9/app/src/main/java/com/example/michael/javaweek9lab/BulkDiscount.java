package com.example.michael.javaweek9lab;

public class BulkDiscount extends DiscountPolicy {
	private int minimum;
	private float percent;
	
	public BulkDiscount(int minimum, float percent) {
		this.minimum = minimum;
		this.percent = percent;
	}
	
	public float computeDiscount(int count, float itemCost) {
		if(count > minimum) {
			return ((count * itemCost) * (this.percent/100));
		} else {
			return count * itemCost;
		}
	}
}
