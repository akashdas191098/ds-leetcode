package com.ds.LongestSubString;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		
		int len = getLength(s);
		
		System.out.print("length : "+len);
	}

	private static int getLength(String s) {
		// TODO Auto-generated method stub
		int left =0,right=0;
		Set<Character> set = new HashSet<Character>();
		int max=0;
		while(right<s.length()) {
			Character c = s.charAt(right);
			if(set.add(c)) {
				max=Math.max(max, right-left+1);
				right++;
			}
			else {
				while(s.charAt(left)!=c) {
					set.remove(s.charAt(left));
					left++;
				}
				set.remove(c);
				left++;
			}
		}
		return max;
	}

}
