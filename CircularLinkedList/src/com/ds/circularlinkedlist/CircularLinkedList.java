package com.ds.circularlinkedlist;

public class CircularLinkedList {
	Node head,tail;
	int size;
	public CircularLinkedList() {
		head=tail=null;
		size=0;
	}
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void addLast(int d) {
		Node node = new Node(d);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
			
		}
		tail.next=head;
		size++;
	}
	
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public void addFirst(int d) {
		Node node = new Node(d);
		if(head==null) {
			head=tail=null;
		}
		else {
			node.next=head;
			head=node;
		}
		tail.next=head;
		size++;
	}
	
	public void removeLast() {
		if(head==null) {
			System.out.print("Deletion not possible");
		}
		else {
			Node tmp = head;
			int p = size;
			while(p>2) {
				tmp=tmp.next;
				p--;
			}
			tmp.next=head;
			tail=tmp;
			size--;
		}
	}
	
	public void removeFirst() {
		if(head==null) {
			System.out.print("Deletion is not possible");
		}
		else {
			head=head.next;
			tail.next=head;
		}
		size--;
	}
	public int searchElement(int ele) {
		int i=1;
		Node tmp = head;
		if(head==null) {
			return -2;
		}
		do {
			if(tmp.data==ele) {
				return i;
			}
			else {
				tmp=tmp.next;
				i++;
			}
		}
		while(tmp!=head);
		return -1;
	}
}
