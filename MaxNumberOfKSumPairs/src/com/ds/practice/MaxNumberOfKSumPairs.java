package com.ds.practice;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int k =5;
		
		int result = maxOperations(nums,k);
		System.out.print(result);

	}

	private static int maxOperations(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int n = 0;
		Arrays.sort(nums);
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<right) {
			if((nums[left]+nums[right])<k) {
				left++;
			}
			else if((nums[left]+nums[right])>k) {
				right--;
			}
			else {
				left++;
				right--;
				n++;
			}
		}
		
		
		return n;
	}

}
