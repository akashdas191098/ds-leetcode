package com.ds.practice;

public class BuySellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		
		int profit = maxProfit(prices);
		
		System.out.print(profit);

	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		
		int basePrice = prices[0];
		int currentProfit = 0;
		
		int maxProfit = 0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<basePrice) {
				basePrice=prices[i];
			}
			else {
				currentProfit=prices[i]-basePrice;
				maxProfit = Math.max(maxProfit, currentProfit);
			}
		}
		return maxProfit;
	}

}
