package com.ds.practice.optimized;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1};
		int result = longestSubArray(nums);
		System.out.print(result);

	}

	private static int longestSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int curr =0;
		int prev =0;
		int ans =0;
		for(int i : nums) {
			if(i==1) {
				curr++;
			}
			else {
				ans = Math.max(ans, curr+prev);
				prev = curr;
				curr=0;
			}
		}
		ans = Math.max(ans, curr+prev);
		return ans==nums.length?ans-1:ans;
	}

}
