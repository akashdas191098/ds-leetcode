package com.ds.doublylinkedlist;

public class DobulyLinkedList {
	Node head,tail;
	int size;
	public DobulyLinkedList() {
		head=tail=null;
		size=0;
	}
	
	public class Node{
		int data;
		Node prev;
		Node next;
		public Node(int d) {
			data = d;
			prev=next=null;
		}
	}
	
	public void addLast(int d) {
		Node node = new Node(d);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		size++;
	}
	
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public void printRev(Node tail) {
		while(tail!=null) {
			System.out.print(tail.data+" ");
			tail=tail.prev;
		}
	}
	
	public void addFirst(int d) {
		if(head==null) {
			addFirst(d);
		}
		else {
			Node node = new Node(d);
			head.prev=node;
			node.next=head;
			head = node;
		}
	}
	
	public void addNthNode(int d,int pos) {
		if(head==null) {
			addFirst(d);
		}
		else if(pos>size) {
			addLast(d);
		}
		else {
			Node node = new Node(d);
			Node ptr = head;
			//int x = pos;
			while(pos>2) {
				ptr=ptr.next;
				pos--;
			}
			node.next=ptr.next;
			ptr.next=node;
			node.prev=ptr;
			size++;
		}
	}
	
	public void removeFirst() {
		if(head==null) {
			System.out.print("Deletion is not possible");
		}
		else {
			head.next.prev=null;
			head=head.next;
			size--;
		}
	}
	
	public void removeLast() {
		if(head==null) {
			System.out.print("Deletion is not possible");
		}
		else {
			tail.prev.next=null;
			tail=tail.prev;
			size--;
		}
	}
	
	public void removeFromNthPosition(int pos) {
		if(head==null||pos>size) {
			System.out.print("Deletion is not posible");
		}
		else if(pos==1) {
			removeFirst();
		}
		else if(pos==size) {
			removeLast();
		}
		else {
			Node tmp = head;
			while(pos>2) {
				tmp=tmp.next;
				pos--;
			}
			//tmp.next.prev=null;
			tmp.next=tmp.next.next;
			tmp.next.prev=tmp;
			size--;
		}
	}
	
	public Node NthRotation(Node head, int pos) {
		if(head==null) {
			return null;
		}
		else if(pos==0) {
			return head;
		}
		
			Node ptr = head;
			pos=pos%size;
			while(pos>2) {
				ptr = ptr.next;
				pos--;
			}
			Node finalPtr = ptr.next;
			ptr.next.prev=null;
			ptr.next=null;
			Node ptr2=tail;
			ptr2.next=head;
			head.prev=ptr2;
		
		return finalPtr;
	}
}
