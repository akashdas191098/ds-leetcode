package com.ds.practice;

public class LongesrSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1};
		
		int n = longestSubarray(nums);
		
		System.out.print(n);
	}

	private static int longestSubarray(int[] nums) {
		// TODO Auto-generated method stub
		int start =0;
		int maxLen =0;
		int zero=0;
		for(int end =0;end<nums.length;end++) {
			if(nums[end]==0) {
				zero++;
			}
			while(zero>1) {
				if(nums[start]==0) {
					zero--;
				}
			start++;
			}
			
			maxLen = Math.max(maxLen, end-start);
		}
		return maxLen;
	}

}
