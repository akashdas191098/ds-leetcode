package com.ds.practice;

public class MaximumTwinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.addLast(4);
		list.addLast(2);
		list.addLast(2);
		list.addLast(3);
		
		list.printList(list.head);
		
		System.out.print("\nMaxTwinSum : "+list.pairSum(list.head));
		;
	}

}
