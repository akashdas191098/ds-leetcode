package com.ds.ContainerWithMostWater;

import java.util.Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		int area = maxArea(height);
		
		System.out.print(area);

	}

	private static int maxArea(int[] height) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = height.length-1;
		int maxArea = 0;
		
		while(left<right) {
			int area = Math.min(height[left], height[right])*(right-left);
			
			maxArea = Math.max(maxArea, area);
			
			if(height[left]<height[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxArea;
	}

}
