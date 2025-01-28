package anagram.practice.ds;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "cbda";
		if(checkAnagram(s1, s2)) {
			System.out.print("anagram");
		}
		else
		{
			System.out.print("not anagram");
		}

	}
	
	public static boolean checkAnagram(String s1,String s2) {
		char char1[]=s1.toCharArray();
		char char2[]=s1.toCharArray();
		if(char1.length!=char2.length) {
			return false;
		}
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		System.out.print("string 1"+char1.toString());
		System.out.print("string 2"+char2.toString());
		
		if(char1.toString().equals(char2.toString())) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
