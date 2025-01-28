package com.practice.ds;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "foo";
		String t = "bar";
		
		boolean result = isIsomorphic(s, t);
		
		System.out.print(result);

	}

	private static boolean isIsomorphic(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		Map<Character, Boolean> used = new HashMap<Character, Boolean>();
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(!map.containsKey(ch)) {
				if(used.containsKey(t.charAt(i))==true) {
					return false;
				}
				else {
					map.put(ch, t.charAt(i));
					used.put(t.charAt(i), true);
				}
			}
			else {
				Character value = map.get(ch);
				if(!(value==t.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

}
