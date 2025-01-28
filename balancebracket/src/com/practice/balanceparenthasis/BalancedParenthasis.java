package com.practice.balanceparenthasis;

import java.util.Stack;

public class BalancedParenthasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()))()";
		
		Boolean result = isbalanced(s);
		
		System.out.print("result : "+result);
	}

	private static Boolean isbalanced(String s) {
		// TODO Auto-generated method stub
		char[] swap = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(swap[i]=='(') {
				stack.push(swap[i]);
				continue;
			}
			else if(stack.isEmpty()) {
				return false;
			}
			else if(swap[i]==')') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
