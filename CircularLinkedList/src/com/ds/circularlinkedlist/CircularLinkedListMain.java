package com.ds.circularlinkedlist;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(6);
		list.addLast(4);
		
		//System.out.print("Circular Linked list ->");
		//list.printList(list.head);
		
		//list.addFirst(6);
		//System.out.print("After adding 1st node ->");
		//list.removeLast();
		//list.removeFirst();
		//System.out.print("Remove last");
		//list.printList(list.head);
		System.out.print("Element Presnt in : "+list.searchElement(2));
	}

}
