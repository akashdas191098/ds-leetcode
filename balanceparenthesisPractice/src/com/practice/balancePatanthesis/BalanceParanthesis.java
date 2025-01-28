package com.practice.balancePatanthesis;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "()(())";
		
		if(isBalanced(s)) {
			System.out.print("balanced");
		}
		else {
			System.out.print("unbalanced");
		}

	}

	private static boolean isBalanced(String s) {
		// TODO Auto-generated method stub
		char str[]=s.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			if(str[i]=='(') {
				stack.push(str[i]);
				continue;
			}
			else if(stack.isEmpty()) {
				return false;
			}
			else if(str[i]==')') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
