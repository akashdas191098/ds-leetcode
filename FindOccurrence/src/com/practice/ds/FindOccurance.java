package com.practice.ds;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sadbutsad";
		String p = "sad";
		int i = findOccurance(s,p);
		System.out.print(i);

	}

	private static int findOccurance(String s,String p) {
		// TODO Auto-generated method stub
		int low =0,flag=0,x=0;
		int high = p.length();
		while(high<s.length()+1) {
			if(s.substring(low, high).equals(p)) {
				flag=1;
				return low;
			}
			else {
				low++;
				high++;
			}
		}
		if(flag==0) {
			x=-1;
		}
		return x;
	}

}
