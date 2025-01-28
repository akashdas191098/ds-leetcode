package com.practice.ds;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		
		Boolean result = isHappy(n);
		
		System.out.print(result);

	}

	private static Boolean isHappy(int n) {
		// TODO Auto-generated method stub
		Set<Integer> used = new HashSet<Integer>();
		
		while(true) {
			int sum = 0;
			while(n!=0) {
				sum+= Math.pow(n%10, 2.0);
				n= n/10;
			}
			
			if(sum==1) {
				return true;
			}
			
			n=sum;
			
			if(used.contains(n)) {
				return false;
			}
			used.add(n);
		}
	}

}
