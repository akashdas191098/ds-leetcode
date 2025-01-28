package com.ds.practice;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "ab";
		String word2 = "pqrs";
		
		String result = mergeAlternately(word1, word2);
		
		System.out.print(result);
	}

	private static String mergeAlternately(String word1, String word2) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int n1=word1.length();
		int n2 = word2.length();
		int i=0;
		
		while(i<n1||i<n2) {
			if(i<n1) {
				sb.append(word1.charAt(i));
			}
			if(i<n2) {
				sb.append(word2.charAt(i));
			}
			i++;
		}
		return sb.toString();
	}

}
