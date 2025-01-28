package balancebracket.practice.ds;

import java.util.Stack;

public class BalanceBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()(()))";
		System.out.print("swap count "+rotationCount(s));
		
		if(isBalanced(s)) {
			System.out.print("\nballenced");
		}
		else {
			System.out.print("\nnot ballenced");
		}
		

	}
	static int swapCount(String s) {
		char[] swap = s.toCharArray();
		int length = s.length();
		int countLeft = 0, countRight=0, swapCount = 0,imbalance=0;
		
		for (int i=0;i<length;i++) {
			if(swap[i]=='(') {
				countLeft++;
				if(imbalance>0) {
					swapCount+=imbalance;
					imbalance--;
				}
			}
			else if(swap[i]==')') {
				countRight++;
				imbalance=(countRight-countLeft);
			}
		}
		//System.out.print("balance"+imbalance);
		return swapCount;
		
	}
	
	static boolean isBalanced(String s) {
		char[] swap = s.toCharArray();
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i=0;i<s.length();i++) {
			 if(swap[i]=='[') {
				 stack.push(swap[i]);
				 continue;
			 }
			 
			 else if(stack.isEmpty()) {
				 return false;
			 }
			 
			 else if(swap[i]==']') {
				 stack.pop();
			 }
		 }
		 return stack.isEmpty();
	}
	
	static int rotationCount(String s) {
		int rotation = 0;
		int openCount = 0, closeCount=0;
		for(char c : s.toCharArray()) {
			if(c=='(') {
				openCount++;
			}
			else if(c==')') {
				if(openCount==0) {
					closeCount++;
				}
				else {
					openCount--;
				}
			}
		}
		
		rotation = openCount+closeCount;
		return rotation;
	}
	


}
