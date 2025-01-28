package com.ds.practice;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		
		int n = 2;
		
		boolean result = canPlaceFlowers(flowerbed, n);
		
		System.out.print(result);

	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i = 0;i<flowerbed.length;i++) {
			if(flowerbed[i]==0) {
				int prev = ((i==0 || flowerbed[i-1]==0))?0:1;
				int next = ((i==flowerbed.length-1 || flowerbed[i+1]==0))?0:1;
				if(prev ==0 && next ==0) {
					flowerbed[i]=1;
					count ++;
				}
			}
		}
		return count>=n;
	}

}
