package com.practice.balanced;

import java.util.Stack;

public class BalancedParenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{([])}";
		
		Boolean result = checkBracket(s);
		
		System.out.print(result);

	}

	private static Boolean checkBracket(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				st.push(s.charAt(i));
			}
			else {
				if((!s.isEmpty())&&((st.peek()=='('&&s.charAt(i)==')') 
						|| (st.peek()=='{'&&s.charAt(i)=='}') 
						|| (st.peek()=='[' && s.charAt(i)==']'))) {
					st.pop();
				}
				else {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

}
