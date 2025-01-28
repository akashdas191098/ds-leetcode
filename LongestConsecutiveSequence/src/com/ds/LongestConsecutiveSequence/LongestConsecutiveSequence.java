package com.ds.LongestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		
		int result = longestConsecutive(nums);
		
		System.out.print(result);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		
		int longest=0;
		
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int num : nums) {
			map.put(num, false);
		}
		
		for(int num : nums) {
			int currentLength=1;
			
			int nextNum = num+1;
			while(map.containsKey(nextNum)&& map.get(nextNum)==false) {
				currentLength++;
				map.put(nextNum, true);
				nextNum++;
			}
			int prevNum=num-1;
			while(map.containsKey(prevNum)&&map.get(prevNum)==false) {
				currentLength++;
				map.put(prevNum, true);
				prevNum--;
			}
			longest=Math.max(currentLength, longest);
		}
		return longest;
	}

}
