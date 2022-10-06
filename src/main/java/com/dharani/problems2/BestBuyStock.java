package com.dharani.problems2;

public class BestBuyStock {

	public static void main(String[] args) {

		int[] prices = {7,6,4,3,1};
		
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		int profit = 0;

		int low = prices[0];
		 
		for (int i = 1; i < prices.length; i++) {
			
			if(low > prices[i]) {
				low = prices[i];
			}else if(low < prices[i]) {
				
				profit += prices[i]-low;
				low = prices[i];
			}
			

		}

		return profit;

	}

}
