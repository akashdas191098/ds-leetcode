package com.ds.practice;

import com.ds.practice.LinkedList.ListNode;

public class LinkedListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(4);
		list.addLast(3);
		list.addLast(2);
		list.addLast(5);
		list.addLast(2);
		list.printList(list.head);
		//list.addFirst(2);
		//System.out.print("\n");
		//list.printList(list.head);
		//System.out.print("\n");
		//ListNode node = list.rotationByN(list.head, 3);
		//list.printList(node);
		System.out.print("\n");
		ListNode node1 = list.partition(list.head, 3);
		list.printList(node1);
	}

}
