package com.practice.ds;

import java.util.HashMap;
import java.util.Map;

public class SecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "paper";
		String t = "title";
		
		boolean result = isIsomorphic(s, t);
		
		System.out.print(result);
	}

	private static boolean isIsomorphic(String s, String t) {
		// TODO Auto-generated method stub
		
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(map.containsKey(ch)) {
				if(!(map.get(ch)==t.charAt(i))) {
					return false;
				}
			}
			else {
				map.put(ch, t.charAt(i));
			}
		}
		return true;
	}

}
