package com.ds.practice;

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "LEFT";
		String str2 = "CODE";
		
		String result = gcdOfStrings(str1,str2);
		
		System.out.print(result);

	}

	private static String gcdOfStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str2.length()>str1.length()) {
			return gcdOfStrings(str2, str1);
		}
		else if(str2.equals(str1)) {
			return str1;
		}
		else if(str1.startsWith(str2)) {
			return gcdOfStrings(str1.substring(str2.length()), str2);
		}
		return "";
	}

}
