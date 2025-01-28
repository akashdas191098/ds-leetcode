package com.ds.practice;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,1,2,3};
		int k = 2;
		
		boolean result=containsNearbyDuplicate(a,k);
		
		System.out.print(result);
	}

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			}
			else {
				int pastIndex = map.get(nums[i]);
				if(Math.abs(pastIndex-i)<=k) {
					return true;
				}
				else {
					map.put(nums[i], i);
				}
			}
		}
		return false;
	}

}
