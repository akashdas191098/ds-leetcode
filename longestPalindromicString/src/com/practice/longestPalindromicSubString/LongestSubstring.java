package com.practice.longestPalindromicSubString;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "babad";
		
		String result = getLongestPalindrome(s);
		
		System.out.print("Longest Pallindrome : "+ result);
	}

	private static String getLongestPalindrome(String s) {
		if(s.length()<=1) {
			return s;
		}
		String lps = "";
		
		for(int i=1;i<s.length();i++) {
			int low = i;
			int high = i;
			while(s.charAt(low)==s.charAt(high)) {
				low--;
				high++;
				if(low==-1||high==s.length()) {
					break;
				}
			}
			String palindrome = s.substring(low+1, high);
			if(palindrome.length()>lps.length()) {
				lps=palindrome;
			}
			
			low = i-1;
			high = i;
			while(s.charAt(low)==s.charAt(high)) {
				low--;
				high++;
				if(low==-1||high==s.length()) {
					break;
				}
			}
			palindrome = s.substring(low+1, high);
			if(palindrome.length()>lps.length()) {
				lps=palindrome;
			}
		}
		return lps;
	}

}
