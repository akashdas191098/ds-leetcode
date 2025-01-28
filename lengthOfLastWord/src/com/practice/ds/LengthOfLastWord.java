package com.practice.ds;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "luffy is still joyboy";
		
		int length = lengthOfLastWord(s);
		
		System.out.print(length);
	}

	private static int lengthOfLastWord(String s) {
		// TODO Auto-generated method stub
		String[] word = s.trim().split(" ");
		return word[word.length-1].length();
	}

}
