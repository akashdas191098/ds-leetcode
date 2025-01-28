package com.ds.practice;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.addLast(1);
		//list.addLast(3);
		//list.addLast(4);
		//list.addLast(7);
		//list.addLast(1);
		list.addLast(2);
		//list.addLast(3);
		//list.addLast(4);
		//list.addLast(6);
		System.out.print("Before delete : ");
		list.printList(list.head);
		System.out.print("\nAfter delete : ");
		list.printList(list.deleteMiddle(list.head));
		//System.out.print("\nAfter delete : ");
		//list.printList(list.deleteMiddle(list.head));

	}

}
