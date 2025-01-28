package com.ds.practice;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		
		double avg = findMaxAverage(nums,k);
		System.out.print(avg);
	}

	private static double findMaxAverage(int[] nums, int k) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0;i<k;i++) {
			sum +=nums[i];
		}
		
		int maxSum = sum;
		int leftIndex= 0;
		int rightIndex = k;
		
		while(rightIndex<nums.length) {
			sum -=nums[leftIndex];
			leftIndex++;
			sum +=nums[rightIndex];
			rightIndex++;
			
			maxSum = Math.max(maxSum, sum);
		}
		
		return (double)maxSum/k;
	}

}
