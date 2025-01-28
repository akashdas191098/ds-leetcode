package com.ds.practice;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {3,2,1,0,4};
		 
		 boolean result = canJump(nums);
		 
		 System.out.print(result);

	}

	private static boolean canJump(int[] nums) {
		// TODO Auto-generated method stub
		
		int finalPosition = nums.length-1;
		
		for(int i=nums.length-2;i>=0;i--) {
			if(i+nums[i]>=finalPosition) {
				finalPosition=i;
			}
		}
		return finalPosition==0;
	}

}
