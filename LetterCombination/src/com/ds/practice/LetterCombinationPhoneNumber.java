package com.ds.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {

	public static void main(String[] args) {
		String digits = "2";
		
		System.out.print("combination : "+getCombination(digits));
	}

	private static List<String> getCombination(String digits) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqrs");
		map.put(8,"tuv");
		map.put(9,"wxyz");
		List<String> srr = new ArrayList<String>();
		String a[] = new String[digits.length()];
		for(int i=0;i<digits.length();i++) {
			String s = map.get(digits.charAt(i)-'0');
			a[i]=s;
		}
		if(a.length==1) {
			int len = a[0].length();
			int i=0;
			while(len!=0) {
				String s = "";
				s=s+a[0].charAt(i);
				srr.add(s);
				i++;
				len--;
			}
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length();j++) {
					
				}
			}
		}
		
		
		return srr;
	}

}
