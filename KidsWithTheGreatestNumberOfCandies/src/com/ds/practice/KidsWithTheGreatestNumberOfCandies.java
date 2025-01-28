package com.ds.practice;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		
		List<Boolean> result = kidsWithCandies(candies,extraCandies);
		
		for(Boolean b : result) {
			System.out.print(b+",");
		}

	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		// TODO Auto-generated method stub
		List<Boolean> result = new ArrayList<Boolean>();
		
		int max = candies[0];
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i]>max) {
				max=candies[i];
			}
		}
		
		for(int i : candies) {
			result.add((i+extraCandies)>=max);
		}
		return result;
	}

}
