package com.ds.practice;

import java.util.HashSet;
import java.util.Set;

public class MaxVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abciiidef";
		int k = 3;
		
		int count = maxVowels(s,k);
		
		System.out.print(count);

	}

	private static int maxVowels(String s, int k) {
		// TODO Auto-generated method stub
		int maxVowels = 0;
		int windowsVowels = 0;
		
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for(int i=0;i<k;i++) {
			if(vowels.contains(s.charAt(i))) {
				windowsVowels++;
			}
		}
		
		maxVowels=windowsVowels;
		
		for(int i=k;i<s.length();i++) {
			if(vowels.contains(s.charAt(i-k))) {
				windowsVowels--;
			}
			if(vowels.contains(s.charAt(i))) {
				windowsVowels++;
			}
			
			maxVowels= Math.max(maxVowels, windowsVowels);
		}
		
		return maxVowels;
	}
	
	

}
