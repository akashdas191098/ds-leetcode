package com.ds.practice.revise;

import java.util.HashSet;
import java.util.Set;

public class MaxVowelInSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abciiidef";
		
		int k =3;
		
		int result = maxVowels(s,k);
		
		System.out.print(result);
	}

	private static int maxVowels(String s, int k) {
		// TODO Auto-generated method stub
		
		int maxVowels = 0;
		int windowVowels = 0;
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for(int i=0;i<k;i++) {
			if(vowels.contains(s.charAt(i))) {
				windowVowels++;
			}
		}
		maxVowels=windowVowels;
		
		for(int i=k;i<s.length();i++) {
			if(vowels.contains(s.charAt(i-k))) {
				windowVowels--;
			}
			if(vowels.contains(s.charAt(i))) {
				windowVowels++;
			}
			
			maxVowels=Math.max(maxVowels, windowVowels);
		}
		return maxVowels;
	}

}
