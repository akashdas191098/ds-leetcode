package com.practice.ds;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		
		int length = longestSubstring(s);
		System.out.print(length);

	}

	private static int longestSubstring(String s) {
		// TODO Auto-generated method stub
		int left = 0,right =0,length = 0;
		Set<Character> set = new HashSet<Character>();
		while(right<s.length()) {
			char c = s.charAt(right);
			if(set.add(c)) {
				length = Math.max(length, right-left+1);
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
		return length;
	}

}
