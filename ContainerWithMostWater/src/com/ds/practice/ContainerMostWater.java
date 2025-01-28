package com.ds.practice;

public class ContainerMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,8,6,2,5,4,8,3,7};
		
		int area = findMaxArea(num);
		
		System.out.print("Area"+area);

	}

	private static int findMaxArea(int[] num) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = num.length-1;
		int maxArea = 0;
		while(left<right) {
			int area = Math.min(num[left], num[right])*(right-left);
			
			maxArea = Math.max(maxArea, area);
			
			if(num[left]<num[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxArea;
	}

}
