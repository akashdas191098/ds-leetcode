package com.ds.practice;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,5,0,4,6};
		
		boolean result = increasingTriplet(nums);
		
		System.out.print(result);

	}

	private static boolean increasingTriplet(int[] nums) {
		// TODO Auto-generated method stub
		
		int i = Integer.MAX_VALUE;
		int j = Integer.MAX_VALUE;
		
		for(int ind = 0;ind<nums.length;ind++) {
			if(nums[ind]<=i) {
				i=nums[ind];
			}
			else if(nums[ind]<=j) {
				j=nums[ind];
			}
			else {
				return true;
			}
		}
		
		return false;
	}

}
