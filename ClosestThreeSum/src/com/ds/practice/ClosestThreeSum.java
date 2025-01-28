package com.ds.practice;

import java.util.Arrays;

public class ClosestThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {-1,2,1,-4};
		
		int target = 1;
		
		System.out.print("Closest Sum" + closestThreeSum(nums,target));

	}

	private static int closestThreeSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		if(nums == null || nums.length<3) {
			return 0;
		}
		Arrays.sort(nums);
		int closestSum = nums[0]+nums[1]+nums[2];
		for(int i = 0;i<nums.length-2;i++) {
			int left = i+1;
			int right = nums.length-1;
			
			while(left<right) {
				int sum = nums[i]+nums[left]+nums[right];
				if(Math.abs(target-sum)<Math.abs(target-closestSum)) {
					closestSum=sum;
				}
				else if(sum<target) {
					left++;
				}
				else {
					right--;
				}
				
			}
			
		}
		
		
		return closestSum;
	}

}
