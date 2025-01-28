package com.practice.lexicographicallstring;

public class LexicographicallString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "akazz";
		System.out.print("lexicographically "+ findLexicographicall(s));

	}

	private static String findLexicographicall(String s) {
		// TODO Auto-generated method stub
		
		if(s=="") {
			return "a";
		}
		
		int i = s.length()-1;
		while(s.charAt(i)=='z'&&i>=0) {
			i--;
		}
		
		if(i==-1) {
			return s+"a";
		}
		else {
			String str = s.substring(0, i)+(char)((int)s.charAt(i)+1)+s.substring(i+1);
			return str;
		}
		
	}

}
