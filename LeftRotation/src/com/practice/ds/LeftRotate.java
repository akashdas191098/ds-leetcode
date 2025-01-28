package com.practice.ds;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5,6};
		
		int k = 3;
		
		rotate(nums,k);
	}

	private static void rotate(int[] nums, int k) {
		// TODO Auto-generated method stub
		k%=nums.length;
		
		rotation(nums, 0, nums.length-1);
		rotation(nums, 0, (nums.length-k)-1);
		rotation(nums, (nums.length-k), nums.length-1);
		
		for(int i : nums) {
			System.out.print(i+",");
		}
				
		
	}
	
	private static void rotation(int[] nums, int start, int end) {
		while(start<end) {
			int tmp = nums[start];
			nums[start]=nums[end];
			nums[end]=tmp;
			start++;
			end--;
		}
	}

}
