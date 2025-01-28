package com.practice.ds;

public class DevideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend=-2147483648;
		int divisor=-1;
		int num = dividend/divisor;
		if(dividend<0 && divisor<0) {
			if(num<0) {
				num = Math.abs(num);
			}
		}
		System.out.print(num);

	}

}
