package com.java.arrays;

public class StockPrice {
	public int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i])
				total += prices[i + 1] - prices[i];
		}
		System.out.println(total);
		return total;
	}

	public static void main(String[] args) {
		StockPrice price = new StockPrice();
		price.maxProfit(new int[] { 7,1,5,3,6,4 });
	}
}
