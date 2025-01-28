package com.ds.practice;

public class MaxConsicutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		
		int k =2;
		
		int result = maxOnes(nums,k);
		
		System.out.print(result);

	}

	private static int maxOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int maxLen = 0;
		int zeroCount = 0;
		for(int end =0;end<nums.length;end++) {
			if(nums[end]==0) {
				zeroCount++;
			}
			while(zeroCount>k) {
				if(nums[start]==0) {
					zeroCount--;
				}
				start++;
			}
			maxLen = Math.max(maxLen, end-start+1);
		}
		return maxLen;
	}

}
