package com.ds.doublylinkedlist;

import com.ds.doublylinkedlist.DobulyLinkedList.Node;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DobulyLinkedList list = new DobulyLinkedList();
		list.addLast(50);
		list.addLast(70);
		list.addLast(80);
		list.addLast(90);
		System.out.print("Dounly Linked List ->");
		list.printList(list.head);
		System.out.print("\n");
		System.out.print("Doubly Linked List Backward Direction ->");
		list.printRev(list.tail);
		System.out.println("Addding Node in start");
		list.addFirst(10);
		list.printList(list.head);
		System.out.println("Adding node in first");
		list.addNthNode(5, 3);
		System.out.print("After adding ->");
		list.printList(list.head);
		//System.out.println("Deletion of N last node");
		//list.removeFirst();
		//list.removeLast();
		//list.removeFromNthPosition(3);
		//System.out.println("After deletion");
		
		//list.printList(list.head);
		Node node=list.NthRotation(list.head, 3);
		System.out.println("after rotation");
		list.printList(node);
		
		System.out.println("\nHead : "+list.head.data + " / "+ "Tail : "+list.tail.data);
	}

}
