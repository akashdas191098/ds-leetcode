package com.ds.linkedlist;

import com.ds.linkedlist.LinkedList.Node;

public class LinkedListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(1);
		//list.addLast(2);
		//list.addLast(3);
		//list.addLast(4);
		//list.addLast(5);
		//list.addLast(7);
		//System.out.println("head before print : "+list.head.data);
		//list.printList(list.head);
		//System.out.print("\n");
		//System.out.println("head after print : "+list.head.data);
		//list.addFirst(8);
		
		//System.out.println("after adding in first : ");
		
		list.printList(list.head);
		System.out.print("size now : "+list.size);
		System.out.print("\n");
		//System.out.println("New Head : "+list.head.data);
		//list.removeFirst();
		//System.out.println("\n after removing first node");
		list.removeLast();
		System.out.println("after removing last node");
		list.printList(list.head);
		System.out.println("head : "+list.head.data);
		System.out.println("tail : "+list.tail.data);
		System.out.println("size then : "+list.size);
		System.out.println("Adding data in given position");
		list.addInNPosition(6, 7);
		System.out.println("after addition");
		list.printList(list.head);
		System.out.println("remove from Nth pos");
		list.removeFromNPosiion(10);
		System.out.println("after deletion from nth pos");
		list.printList(list.head);
		System.out.println("Generating K rotation ->");
		Node node = list.rotationByN(list.head, 2);
		System.out.println("new List ->");
		list.printList(node);
		
	}

}
