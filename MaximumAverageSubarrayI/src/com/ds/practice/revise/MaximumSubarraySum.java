package com.ds.practice.revise;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,12,-5,-6,50,3};
		
		int k =4;
		
		double sum = maxSubArraySum(a,k);
		
		System.out.print(sum);

	}

	private static double maxSubArraySum(int[] a,int k) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		int maxSum = sum;
		int left = 0;
		int right = k;
		
		while(right<a.length) {
			sum-=a[left];
			left++;
			sum+=a[right];
			right++;
			maxSum = Math.max(maxSum, sum);
		}
				
		return (double)maxSum/k;
	}

}
